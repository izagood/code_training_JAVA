package test_project;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManagerFactory;

import org.junit.Test;

public class App {
//	@Test
//	public void test() {
//		try {
//			String test = setClientCredentials(new File("C:/Dev/jobWorkspace/bizPushTestProjs/pushy_jdk18_test/pushy18/p12/bizmob3.0_push_mcnc1234.p12"), "mcnc1234");
//			System.out.println(test);
//		} catch (SSLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
//	@Test
//	public void test() throws KeyStoreException, SSLException, IOException, NoSuchAlgorithmException, CertificateException {
//		KeyStore ks = KeyStore.getInstance("PKCS12");
//		FileInputStream p12 = new FileInputStream(new File("C:/Dev/jobWorkspace/bizPushTestProjs/pushy_jdk18_test/pushy18/p12/bizmob3.0_push_mcnc1234.p12"));
//		ks.load(p12, "mcnc1234".toCharArray());
//		System.out.println(ks.getCertificate(ks.aliases().nextElement()));
//	}
	
	@Test
	public void test() throws KeyStoreException, SSLException, IOException, NoSuchAlgorithmException, CertificateException, UnrecoverableKeyException, KeyManagementException {
		KeyStore ks = KeyStore.getInstance("PKCS12");
		FileInputStream p12 = new FileInputStream(new File("C:/Dev/jobWorkspace/bizPushTestProjs/pushy_jdk18_test/pushy18/p12/bizmob3.0_push_mcnc1234.p12"));
		ks.load(p12, "mcnc1234".toCharArray());
//		System.out.println(ks.getCertificate(ks.aliases().nextElement()));
		KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        kmf.init(ks, "mcnc1234".toCharArray());
        KeyManager[] keyManagers = kmf.getKeyManagers();
        SSLContext sslContext = SSLContext.getInstance("TLS");
        final TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        tmf.init((KeyStore) null);
        sslContext.init(keyManagers, tmf.getTrustManagers(), null);
        final SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();
        System.out.println(sslSocketFactory);
	}
	

	public String setClientCredentials(final File p12File, final String p12Password) throws SSLException, IOException {
		InputStream p12InputStream = null;
		try {
			p12InputStream = new FileInputStream(p12File);

			return setClientCredentials1(p12InputStream, p12Password);
		} finally {
			p12InputStream.close();
		}
	}

	public String setClientCredentials1(final InputStream p12InputStream, final String p12Password)
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

		String result = x509Certificate.toString() + privateKey.toString() + p12Password;

		return result;
	}
}
