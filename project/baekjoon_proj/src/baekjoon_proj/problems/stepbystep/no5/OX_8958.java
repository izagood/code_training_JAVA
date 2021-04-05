package baekjoon_proj.problems.stepbystep.no5;

import java.util.Scanner;

public class OX_8958 {
	
	public void quizCharArray() {
		Scanner scanner = new Scanner(System.in);
		
		int quizNum = scanner.nextInt();
		
		for(int i = 0; i<quizNum; i++) {
			int score = 0;
			int index = 0;
			
			String next = scanner.next();
			char[] oxArray = next.toCharArray();
			for(char item : oxArray) {
				if(item == 'O') {
					index++;
					score += index;
				}else {
					index = 0;
				}
			}
			System.out.println(score);
		}
	}
	
	public void quizStringArray() {
		Scanner scanner = new Scanner(System.in);
		
		int quizNum = scanner.nextInt();
		
		for(int i = 0; i<quizNum; i++) {
			int score = 0;
			int index = 0;
			
			String next = scanner.next();
			String[] oxArray = next.split("");
			for(String item : oxArray) {
				if(item.equals("O")) {
					index++;
					score += index;
				}else {
					index = 0;
				}
			}
			System.out.println(score);
		}
	}
}
