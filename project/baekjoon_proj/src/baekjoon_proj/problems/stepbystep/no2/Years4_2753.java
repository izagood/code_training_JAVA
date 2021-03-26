package baekjoon_proj.problems.stepbystep.no2;

import java.util.Scanner;

/**
 * 
 * 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.

윤년은 연도가 4의 배수이면서, 
100의 배수가 아닐 때 
또는 400의 배수일 때이다.

예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다. 
1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다. 
하지만, 2000년은 400의 배수이기 때문에 윤년이다.
 * 
 */
public class Years4_2753 {

	public void year4() {
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		
		boolean yearX4 = ((year % 4) == 0) ? true : false;
		boolean yearX100 = ((year % 100) == 0) ? true : false;
		boolean yearX400 = ((year % 400) == 0) ? true : false;
		
		if((yearX4 && !yearX100) || yearX400) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
}
