package baekjoon_proj.problems.stepbystep.no7;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CroaAlpabet_2941 {

	public void cora() {
		String pattern = ".*c=.*";
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		scanner.close();
		
		boolean matches = Pattern.matches(pattern, input);
		System.out.println(matches);
	}
}
