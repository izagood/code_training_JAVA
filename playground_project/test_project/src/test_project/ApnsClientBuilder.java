package test_project;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;

import javax.net.ssl.SSLException;

import io.netty.channel.EventLoopGroup;
import io.netty.handler.codec.http2.Http2FrameLogger;
import io.netty.handler.codec.http2.Http2SecurityUtil;
import io.netty.handler.ssl.OpenSsl;
import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslContextBuilder;
import io.netty.handler.ssl.SslProvider;
import io.netty.handler.ssl.SupportedCipherSuiteFilter;
import io.netty.util.ReferenceCounted;

@SuppressWarnings("unused")
public class ApnsClientBuilder {

	private X509Certificate clientCertificate;
	private PrivateKey privateKey;
	private String privateKeyPassword;

	public ApnsClientBuilder setClientCredentials(final File p12File, final String p12Password)
			throws SSLException, IOException {
		InputStream p12InputStream = null;
		try {
			p12InputStream = new FileInputStream(p12File);

			return this.setClientCredentials(p12InputStream, p12Password);
		} finally {
			p12InputStream.close();
		}
	}

	/**
	 * <p>
	 * Sets the TLS credentials for the client under construction using the data
	 * from the given PKCS#12 input stream. Clients constructed with TLS credentials
	 * will use TLS-based authentication when sending push notifications. The
	 * PKCS#12 data <em>must</em> contain a certificate/private key pair.
	 * </p>
	 *
	 * <p>
	 * Clients may not have both TLS credentials and a signing key.
	 * </p>
	 *
	 * @param p12InputStream an input stream to a PKCS#12-formatted file containing
	 *                       the certificate and private key to be used to identify
	 *                       the client to the APNs server
	 * @param p12Password    the password to be used to decrypt the contents of the
	 *                       given PKCS#12 file; passwords may be blank (i.e.
	 *                       {@code ""}), but must not be {@code null}
	 *
	 * @throws SSLException if the given PKCS#12 file could not be loaded or if any
	 *                      other SSL-related problem arises when constructing the
	 *                      context
	 * @throws IOException  if any IO problem occurred while attempting to read the
	 *                      given PKCS#12 input stream
	 *
	 * @return a reference to this builder
	 *
	 * @since 0.8
	 */
	public ApnsClientBuilder setClientCredentials(final InputStream p12InputStream, final String p12Password)
			throws SSLException, IOException {
		final X509Certificate x509Certificate;
		final PrivateKey privateKey;

		try {
			final KeyStore.PrivateKeyEntry privateKeyEntry = P12Util
					.getFirstPrivateKeyEntryFromP12InputStream(p12InputStream, p12Password);

			final Certificate certificate = privateKeyEntry.getCertificate();

			if (!(certificate instanceof X509Certificate)) {
				throw new KeyStoreException(
						"Found a certificate in the provided PKCS#12 file, but it was not an X.509 certificate.");
			}

			x509Certificate = (X509Certificate) certificate;
			privateKey = privateKeyEntry.getPrivateKey();
		} catch (final KeyStoreException e) {
			throw new SSLException(e);
		}

		return this.setClientCredentials(x509Certificate, privateKey, p12Password);
	}

	/**
	 * <p>
	 * Sets the TLS credentials for the client under construction. Clients
	 * constructed with TLS credentials will use TLS-based authentication when
	 * sending push notifications.
	 * </p>
	 *
	 * <p>
	 * Clients may not have both TLS credentials and a signing key.
	 * </p>
	 *
	 * @param clientCertificate  the certificate to be used to identify the client
	 *                           to the APNs server
	 * @param privateKey         the private key for the client certificate
	 * @param privateKeyPassword the password to be used to decrypt the private key;
	 *                           may be {@code null} if the private key does not
	 *                           require a password
	 *
	 * @return a reference to this builder
	 *
	 * @since 0.8
	 */
	public ApnsClientBuilder setClientCredentials(final X509Certificate clientCertificate, final PrivateKey privateKey,
			final String privateKeyPassword) {
		this.clientCertificate = clientCertificate;
		this.privateKey = privateKey;
		this.privateKeyPassword = privateKeyPassword;

		return this;
	}

	/**
	 * <p>
	 * Sets the signing key for the client under construction. Clients constructed
	 * with a signing key will use token-based authentication when sending push
	 * notifications.
	 * </p>
	 *
	 * <p>
	 * Clients may not have both a signing key and TLS credentials.
	 * </p>
	 *
	 * @param signingKey the signing key to be used by the client under construction
	 *
	 * @return a reference to this builder
	 *
	 * @see ApnsSigningKey#loadFromPkcs8File(File, String, String)
	 * @see ApnsSigningKey#loadFromInputStream(InputStream, String, String)
	 *
	 * @since 0.10
	 */
	public ApnsClientBuilder setSigningKey(final ApnsSigningKey signingKey) {
		this.signingKey = signingKey;

		return this;
	}

	/**
	 * <p>
	 * Sets the duration after which authentication tokens should expire and be
	 * regenerated from the signing key for clients using token-based
	 * authentication. Has no effect for clients using TLS-based authentication.
	 * </p>
	 *
	 * <p>
	 * At the time of writing, the APNs server will treat tokens as "expired" after
	 * 60 minutes. The default expiration duration for clients using token-based
	 * authentication is 50 minutes. Callers <em>should not</em> set a non-default
	 * value unless the upstream behavior changes.
	 * </p>
	 *
	 * @param tokenExpiration the duration after which authentication tokens should
	 *                        expire
	 *
	 * @return a reference to this builder
	 *
	 * @since 0.13.11
	 */
	public ApnsClientBuilder setTokenExpiration(final Duration tokenExpiration) {
		this.tokenExpiration = tokenExpiration;
		return this;
	}

	/**
	 * <p>
	 * Sets the trusted certificate chain for the client under construction using
	 * the contents of the given PEM file. If not set (or {@code null}), the client
	 * will use the JVM's default trust manager.
	 * </p>
	 *
	 * <p>
	 * Callers will generally not need to set a trusted server certificate chain in
	 * normal operation, but may wish to do so for <a href=
	 * "https://www.owasp.org/index.php/Certificate_and_Public_Key_Pinning">certificate
	 * pinning</a> or connecting to a mock server for integration testing or
	 * benchmarking.
	 * </p>
	 *
	 * @param certificatePemFile a PEM file containing one or more trusted
	 *                           certificates
	 *
	 * @return a reference to this builder
	 *
	 * @since 0.8
	 */
	public ApnsClientBuilder setTrustedServerCertificateChain(final File certificatePemFile) {
		this.trustedServerCertificatePemFile = certificatePemFile;
		this.trustedServerCertificateInputStream = null;
		this.trustedServerCertificates = null;

		return this;
	}

	/**
	 * <p>
	 * Sets the trusted certificate chain for the client under construction using
	 * the contents of the given PEM input stream. If not set (or {@code null}), the
	 * client will use the JVM's default trust manager.
	 * </p>
	 *
	 * <p>
	 * Callers will generally not need to set a trusted server certificate chain in
	 * normal operation, but may wish to do so for <a href=
	 * "https://www.owasp.org/index.php/Certificate_and_Public_Key_Pinning">certificate
	 * pinning</a> or connecting to a mock server for integration testing or
	 * benchmarking.
	 * </p>
	 *
	 * @param certificateInputStream an input stream to PEM-formatted data
	 *                               containing one or more trusted certificates
	 *
	 * @return a reference to this builder
	 *
	 * @since 0.8
	 */
	public ApnsClientBuilder setTrustedServerCertificateChain(final InputStream certificateInputStream) {
		this.trustedServerCertificatePemFile = null;
		this.trustedServerCertificateInputStream = certificateInputStream;
		this.trustedServerCertificates = null;

		return this;
	}

	/**
	 * <p>
	 * Sets the trusted certificate chain for the client under construction. If not
	 * set (or {@code null}), the client will use the JVM's default trust manager.
	 * </p>
	 *
	 * <p>
	 * Callers will generally not need to set a trusted server certificate chain in
	 * normal operation, but may wish to do so for <a href=
	 * "https://www.owasp.org/index.php/Certificate_and_Public_Key_Pinning">certificate
	 * pinning</a> or connecting to a mock server for integration testing or
	 * benchmarking.
	 * </p>
	 *
	 * @param certificates one or more trusted certificates
	 *
	 * @return a reference to this builder
	 *
	 * @since 0.8
	 */
	public ApnsClientBuilder setTrustedServerCertificateChain(final X509Certificate... certificates) {
		this.trustedServerCertificatePemFile = null;
		this.trustedServerCertificateInputStream = null;
		this.trustedServerCertificates = certificates;

		return this;
	}

	/**
	 * <p>
	 * Sets the event loop group to be used by the client under construction. If not
	 * set (or if {@code null}), the client will create and manage its own event
	 * loop group.
	 * </p>
	 *
	 * <p>
	 * Generally speaking, callers don't need to set event loop groups for clients,
	 * but it may be useful to specify an event loop group under certain
	 * circumstances. In particular, specifying an event loop group that is shared
	 * among multiple {@code ApnsClient} instances can keep thread counts
	 * manageable. Regardless of the number of concurrent {@code ApnsClient}
	 * instances, callers may also wish to specify an event loop group to take
	 * advantage of certain platform-specific optimizations (e.g. {@code epoll} or
	 * {@code KQueue} event loop groups).
	 * </p>
	 *
	 * @param eventLoopGroup the event loop group to use for this client, or
	 *                       {@code null} to let the client manage its own event
	 *                       loop group
	 *
	 * @return a reference to this builder
	 *
	 * @since 0.8
	 */
	public ApnsClientBuilder setEventLoopGroup(final EventLoopGroup eventLoopGroup) {
		this.eventLoopGroup = eventLoopGroup;
		return this;
	}

	/**
	 * Sets the maximum number of concurrent connections the client under
	 * construction may attempt to maintain to the APNs server. By default, clients
	 * will attempt to maintain a single connection to the APNs server.
	 *
	 * @param concurrentConnections the maximum number of concurrent connections the
	 *                              client under construction may attempt to
	 *                              maintain
	 *
	 * @return a reference to this builder
	 *
	 * @since 0.11
	 */
	public ApnsClientBuilder setConcurrentConnections(final int concurrentConnections) {
		this.concurrentConnections = concurrentConnections;
		return this;
	}

	/**
	 * Sets the metrics listener for the client under construction. Metrics
	 * listeners gather information that describes the performance and behavior of a
	 * client, and are completely optional.
	 *
	 * @param metricsListener the metrics listener for the client under
	 *                        construction, or {@code null} if this client should
	 *                        not report metrics to a listener
	 *
	 * @return a reference to this builder
	 *
	 * @since 0.8
	 */
	public ApnsClientBuilder setMetricsListener(final ApnsClientMetricsListener metricsListener) {
		this.metricsListener = metricsListener;
		return this;
	}

	/**
	 * Sets the proxy handler factory to be used to construct proxy handlers when
	 * establishing a new connection to the APNs gateway. A client's proxy handler
	 * factory may be {@code null}, in which case the client will connect to the
	 * gateway directly and will not use a proxy. By default, clients will not use a
	 * proxy.
	 *
	 * @param proxyHandlerFactory the proxy handler factory to be used to construct
	 *                            proxy handlers, or {@code null} if this client
	 *                            should not use a proxy
	 *
	 * @return a reference to this builder
	 *
	 * @since 0.8
	 */
	public ApnsClientBuilder setProxyHandlerFactory(final ProxyHandlerFactory proxyHandlerFactory) {
		this.proxyHandlerFactory = proxyHandlerFactory;
		return this;
	}

	/**
	 * Sets the maximum amount of time, in milliseconds, that the client under
	 * construction will wait to establish a connection with the APNs server before
	 * the connection attempt is considered a failure.
	 *
	 * @param timeout the maximum amount of time to wait for a connection attempt to
	 *                complete
	 *
	 * @return a reference to this builder
	 *
	 * @since 0.8
	 */
	public ApnsClientBuilder setConnectionTimeout(final Duration timeout) {
		this.connectionTimeout = timeout;
		return this;
	}

	/**
	 * Sets the amount of idle time (in milliseconds) after which the client under
	 * construction will send a PING frame to the APNs server. By default, clients
	 * will send a PING frame after an idle period of
	 * {@link com.eatthepath.pushy.apns.ApnsClientBuilder#DEFAULT_IDLE_PING_INTERVAL}.
	 *
	 * @param idlePingInterval the amount of idle time after which the client will
	 *                         send a PING frame
	 *
	 * @return a reference to this builder
	 *
	 * @since 0.10
	 */
	public ApnsClientBuilder setIdlePingInterval(final Duration idlePingInterval) {
		this.idlePingInterval = idlePingInterval;
		return this;
	}

	/**
	 * Sets the amount of time clients should wait for in-progress requests to
	 * complete before closing a connection during a graceful shutdown.
	 *
	 * @param gracefulShutdownTimeout the amount of time to wait for in-progress
	 *                                requests to complete before closing a
	 *                                connection
	 *
	 * @return a reference to this builder
	 *
	 * @see ApnsClient#close()
	 *
	 * @since 0.8
	 */
	public ApnsClientBuilder setGracefulShutdownTimeout(final Duration gracefulShutdownTimeout) {
		this.gracefulShutdownTimeout = gracefulShutdownTimeout;
		return this;
	}

	/**
	 * Sets the HTTP/2 frame logger for the client under construction. HTTP/2 frame
	 * loggers log all HTTP/2 frames sent to or from the client to the logging
	 * system of your choice via SLF4J. Frame logging is extremely verbose and is
	 * recommended only for debugging purposes.
	 *
	 * @param frameLogger the frame logger to be used by the client under
	 *                    construction or {@code null} if the client should not log
	 *                    individual HTTP/2 frames
	 *
	 * @return a reference to this builder
	 *
	 * @see <a href="https://www.slf4j.org/">SLF4J</a>
	 *
	 * @since 0.12
	 */
	public ApnsClientBuilder setFrameLogger(final Http2FrameLogger frameLogger) {
		this.frameLogger = frameLogger;
		return this;
	}

	/**
	 * Constructs a new {@link ApnsClient} with the previously-set configuration.
	 *
	 * @return a new ApnsClient instance with the previously-set configuration
	 *
	 * @throws SSLException          if an SSL context could not be created for the
	 *                               new client for any reason
	 * @throws IllegalStateException if this method is called without specifying an
	 *                               APNs server address, if this method is called
	 *                               without providing TLS credentials or a signing
	 *                               key, or if this method is called with both TLS
	 *                               credentials and a signing key
	 *
	 * @since 0.8
	 */
	public ApnsClient build() throws SSLException {
		if (this.apnsServerAddress == null) {
			throw new IllegalStateException("No APNs server address specified.");
		}

		if (this.clientCertificate == null && this.privateKey == null && this.signingKey == null) {
			throw new IllegalStateException("No client credentials specified; either TLS credentials (a "
					+ "certificate/private key) or an APNs signing key must be provided before building a client.");
		} else if ((this.clientCertificate != null || this.privateKey != null) && this.signingKey != null) {
			throw new IllegalStateException("Clients may not have both a signing key and TLS credentials.");
		}

		final SslContext sslContext;
		{
			final SslProvider sslProvider;

			if (OpenSsl.isAvailable()) {
				log.info("Native SSL provider is available; will use native provider.");
				sslProvider = SslProvider.OPENSSL_REFCNT;
			} else {
				log.info("Native SSL provider not available; will use JDK SSL provider.");
				sslProvider = SslProvider.JDK;
			}

			final SslContextBuilder sslContextBuilder = SslContextBuilder.forClient().sslProvider(sslProvider)
					.ciphers(Http2SecurityUtil.CIPHERS, SupportedCipherSuiteFilter.INSTANCE);

			if (this.clientCertificate != null && this.privateKey != null) {
				sslContextBuilder.keyManager(this.privateKey, this.privateKeyPassword, this.clientCertificate);
			}

			if (this.trustedServerCertificatePemFile != null) {
				sslContextBuilder.trustManager(this.trustedServerCertificatePemFile);
			} else if (this.trustedServerCertificateInputStream != null) {
				sslContextBuilder.trustManager(this.trustedServerCertificateInputStream);
			} else if (this.trustedServerCertificates != null) {
				sslContextBuilder.trustManager(this.trustedServerCertificates);
			}

			sslContext = sslContextBuilder.build();
		}

		try {
			return new ApnsClient(this.apnsServerAddress, sslContext, this.signingKey, this.tokenExpiration,
					this.proxyHandlerFactory, this.connectionTimeout, this.idlePingInterval,
					this.gracefulShutdownTimeout, this.concurrentConnections, this.metricsListener, this.frameLogger,
					this.eventLoopGroup);
		} finally {
			if (sslContext instanceof ReferenceCounted) {
				((ReferenceCounted) sslContext).release();
			}
		}
	}
}
