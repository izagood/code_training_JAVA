package baekjoon_proj.problems.stepbystep.no7;

import java.util.Scanner;

public class GroupWordCheck_1316 {

	// 그룹 단어의 개수 출력
	public void check() {
		int count = 0;

		Scanner scanner = new Scanner(System.in);

		int wordNum = scanner.nextInt();

		for (int i = 0; i < wordNum; i++) {
			String word = scanner.next();
			// 이 word가 그룹단어 인지 판단하고 count 높여야 함.

			char[] charArr = new char[word.length()];

			// if() {
			// // 그룹 단어 이면
			// count++;
			// }
		}

		scanner.close();

		System.out.println(count);
	}

}
