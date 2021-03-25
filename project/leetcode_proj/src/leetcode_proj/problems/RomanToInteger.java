package leetcode_proj.problems;

public class RomanToInteger {
	
	public int romanToInt(String s) {
		int total = 0;
		char beforeChar = '\u0000';

		for (int i = 0; i < s.length(); i++) {

			char nowChar = s.charAt(i);

			// 순서 중요 큰 수 부터 왼쪽에서 부터 시작하기 때문에 큰 수가 if else문에서 위로 와야 함
			if (nowChar == 'M') {
				if (beforeChar == 'C') {
					total += 800;
				} else {
					total += 1000;
				}
				beforeChar = 'M';
			}

			if (nowChar == 'D') {
				if (beforeChar == 'C') {
					total += 300;
				} else {
					total += 500;
				}
				beforeChar = 'D';
			}

			if (nowChar == 'C') {
				if (beforeChar == 'X') {
					total += 80;
				} else {
					total += 100;
				}
				beforeChar = 'C';
			}

			if (nowChar == 'L') {
				if (beforeChar == 'X') {
					total += 30;
				} else {
					total += 50;
				}
				beforeChar = 'L';
			}

			if (nowChar == 'X') {
				if (beforeChar == 'I') {
					total += 8;
				} else {
					total += 10;
				}
				beforeChar = 'X';
			}

			if (nowChar == 'V') {
				if (beforeChar == 'I') {
					total += 3;
				} else {
					total += 5;
				}
				beforeChar = 'V';
			}

			if (nowChar == 'I') {
				total += 1;
				beforeChar = 'I';
			}
		}
		return total;
	}
}
