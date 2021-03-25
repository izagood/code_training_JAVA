package baekjoon_proj.problems.stepbystep.no2;

import java.io.IOException;
import java.util.Scanner;

public class TwoNumer_1330 {
	public void twoNumber() throws IOException {
		Scanner reader = new Scanner(System.in);
		
		int num1 = reader.nextInt();
		int num2 = reader.nextInt();
		
		if(num1 < num2) {
			System.out.println("<");
		}else if(num1 > num2) {
			System.out.println(">");
		}else {
			System.out.println("==");
		}
	}
}
