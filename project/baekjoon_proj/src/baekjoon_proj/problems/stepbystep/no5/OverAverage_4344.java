package baekjoon_proj.problems.stepbystep.no5;

import java.util.Scanner;

public class OverAverage_4344 {
	
	public void averNextInt() {
		Scanner scanner = new Scanner(System.in);
		int caseNum = scanner.nextInt();
		
		for(int i=0; i<caseNum; i++) {
			int stuNum = scanner.nextInt();
			double[] scores = new double[stuNum];
			
			int totalScore = 0;
			double aver = 0.0;
			
			for(int j=0; j<stuNum; j++) {
				double score = (double) scanner.nextInt();
				totalScore += score;
				scores[j] = score;
			}
			
			aver = totalScore / (double) stuNum;
			
			int overStu = 0;
			
			for(int k=0; k<stuNum; k++) {
				if(scores[k] > aver) {
					overStu++;
				}
			}
			double overStuAve = overStu / (double) stuNum * 100;
			
			System.out.printf("%.3f", overStuAve);
			System.out.println("%");
		}
		scanner.close();
	}
	
	public void averNextLine() {
		Scanner scanner = new Scanner(System.in);
		int caseNum = Integer.parseInt(scanner.nextLine());
		
		for(int i=0; i<caseNum; i++) {
			String nextLine = scanner.nextLine();
			String[] nums = nextLine.split(" ");
			int stuNum = Integer.parseInt(nums[0]);
			
			int totalScore = 0;
			double aver = 0.0;
			
			for(int j=0; j<stuNum; j++) {
				totalScore += Integer.parseInt(nums[j+1]);
			}
			
			aver = totalScore / (double) stuNum;
			
			int overStu = 0;
			
			for(int k=0; k<stuNum; k++) {
				if(Integer.parseInt(nums[k+1]) > aver) {
					overStu++;
				}
			}
			double overStuAve = overStu / (double) stuNum * 100;
			
			System.out.printf("%.3f", overStuAve);
			System.out.println("%");
		}
		scanner.close();
	}
}
