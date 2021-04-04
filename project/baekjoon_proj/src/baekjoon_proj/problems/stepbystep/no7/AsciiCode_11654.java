package baekjoon_proj.problems.stepbystep.no7;

import java.util.Scanner;

/**
 * @문제
 * 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때,
 * 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
 * 
 * 
 * @author ljbfi
 *
 */
public class AsciiCode_11654 {

	public void ascii() {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		byte inputByte = (byte) input.charAt(0);
		System.out.println(inputByte);
		scanner.close();
	}

}
