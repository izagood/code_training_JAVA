package baekjoon_proj.problems.stepbystep.no7;

import java.util.Scanner;

public class SangSu_2908 {

	public void sangSuNum() {
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		scanner.close();
		
		int reverseNum1 = reverse(num1);
		int reverseNum2 = reverse(num2);
		
		if(reverseNum1 < reverseNum2) {
			System.out.println(reverseNum2);
		}else {
			System.out.println(reverseNum1);
		}
	}
	
	static public int reverse(int x) {
		
		int num1 = x / 100;
		int num2 = x % 100 / 10;
		int num3 = x % 10;
		
		int result = num3 * 100 + num2 * 10 + num1;
		
		return result;
	}
}
