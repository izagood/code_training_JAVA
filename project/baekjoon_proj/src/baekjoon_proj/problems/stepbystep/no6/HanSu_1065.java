package baekjoon_proj.problems.stepbystep.no6;

import java.util.Scanner;

/**
 * @문제
 * 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다.
 * 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. 
 * N이 주어졌을 때, 1보다 크거나 같고, 
 * N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 
 * 
 * @입력
 * 1<= N < 1000
 * 
 * @author ljbfi
 *
 */
public class HanSu_1065 {
	/**
	 * 99
	 * 100 101 102 103 104 105 106 107 108 109 110
	 */
	public void hanSu() {
		Scanner scanner = new Scanner(System.in); 
		
		int input = scanner.nextInt();
		int output = 0;
		
		if(input < 100) {
			output = input;
		}else {
			int countHanSU = 0;
			
			for(int i=100; i<=input; i++) {
				int one = i / 100;
				int two = (i % 100) / 10;
				int three = i % 10;
				
				if((two - one) == (three - two)) {
					countHanSU++;
				}
			}
			output = 99 + countHanSU;
		}
		
		System.out.println(output);
		scanner.close();
	}

}
