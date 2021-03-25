package qrGenJava.zxing;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.Path;
import java.util.HashMap;

import javax.imageio.ImageIO;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

public class CreateQR {

	public void createQRCode() {

		// QR 사이즈
		int width = 300; // 이미지 가로
		int height = 300; // 이미지 세로

		String format = "jpg"; // png로 설정 할 경우 흑백으로 출력 됨
		String content = "https://coinmarketcap.com/ko/currencies/bitcoin-cash-abc-2/";// QR 컨텐츠 내용

		// QR 설정
		HashMap<EncodeHintType, Object> configuration = new HashMap<EncodeHintType, Object>();
		configuration.put(EncodeHintType.CHARACTER_SET, "utf-8");
		/* 
		 * 에러 보정 레벨 [L, M, Q, H] -> L : 7%, M : 15%, Q : 25%, H : 30%
		 */
		configuration.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
		configuration.put(EncodeHintType.MARGIN, 2);
		
		// QR 생성
		try {
			MultiFormatWriter multiFormatWriter = new MultiFormatWriter();
			
			BitMatrix bitMatrix = multiFormatWriter.encode(content, BarcodeFormat.QR_CODE, width, height, configuration);
			// 순수 QR 나오는 경로
			Path file = new File("C:/qrTest/test.png").toPath();
			// QR 생성 함수
			MatrixToImageWriter.writeToPath(bitMatrix, format, file);
			
			// *************LOGO 추가 하는 코드*****************
			
			// 생성된 QR 이미지 읽음
			BufferedImage bufferedImage = ImageIO.read(new File(file.toString()));
			// 그래픽
			Graphics2D graphics = bufferedImage.createGraphics();
			// 삽입할 로고 이미지 경로
			BufferedImage logo = ImageIO.read(new File("C:/qrTest/en.png"));

			// 에러 보정 레벨에 따라 %가 달라져야 함. 현재 20% 코드
			int logoWidth = logo.getWidth() > bufferedImage.getWidth() * 2 / 10 ? (bufferedImage.getWidth() * 2 / 10)
					: logo.getWidth();
			int logoHeight = logo.getHeight() > bufferedImage.getHeight() * 2 / 10
					? (bufferedImage.getHeight() * 2 / 10)
					: logo.getHeight();
			// 정중앙 x, y
			int x = (bufferedImage.getWidth() - logoWidth) / 2;
			int y = (bufferedImage.getHeight() - logoHeight) / 2;
			// 로고 이미지와 둥근 사각형 로고 외곽선
			graphics.drawImage(logo, x, y, logoWidth, logoHeight, null);
			graphics.drawRoundRect(x, y, logoWidth, logoHeight, 15, 15);
			// 로고 외곽선 두께
//			graphics.setStroke(new BasicStroke(2));
			// 로고 외곽선
//			graphics.setColor(Color.WHITE);
//			graphics.drawRect(x, y, logoWidth, logoHeight);

			// **************QR 외곽선 그리기***************
			int outLineX = 0;
			int outLineY = 0;

			int qrX = bufferedImage.getWidth();
			int qrY = bufferedImage.getHeight();
			graphics.setStroke(new BasicStroke(10));
			graphics.setColor(Color.BLACK);
			graphics.drawRect(outLineX, outLineY, qrX, qrY);

			graphics.dispose();

			logo.flush();
			bufferedImage.flush();
			// 로고와 합쳐인 QR 나오는 경로
			ImageIO.write(bufferedImage, format, new File("C:/qrTest/img.png"));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
