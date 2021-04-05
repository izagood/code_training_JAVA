package baekjoon_proj.problems.stepbystep.no7;

import java.util.Scanner;

public class StringRepetition_2675 {

	public void repetition() {
		Scanner scanner = new Scanner(System.in);
		
		int inputcase = scanner.nextInt();
		for(int i=0; i<inputcase; i++) {
			int repetNum = scanner.nextInt();
			String repetString = scanner.next();
			for(int j=0; j<repetString.length(); j++) {
				for(int k=0; k<repetNum; k++) {
					System.out.print(repetString.substring(j, j+1));
				}
			}
			System.out.println();
		}
		scanner.close();
	}
}
