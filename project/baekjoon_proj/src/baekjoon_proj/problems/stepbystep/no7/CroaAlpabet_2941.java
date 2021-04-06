package baekjoon_proj.problems.stepbystep.no7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CroaAlpabet_2941 {
// ddz=z=
	public void cora_regex() {
		String[] croaStrArr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		scanner.close();
		int count = 0;
		String replaceInput = "";
		for(String croaStr : croaStrArr) {
			Pattern pattern = Pattern.compile(croaStr);
			Matcher matcher = pattern.matcher(input);
			replaceInput = matcher.replaceAll(" ");
			input = replaceInput;
			
			for(int i=0; matcher.find(i); i = matcher.end()) {
				count++;
			}
		}
		Pattern pattern = Pattern.compile(" ");
		Matcher matcher = pattern.matcher(replaceInput);
		replaceInput = matcher.replaceAll("");
		
		int total = replaceInput.length() + count;
		System.out.println(total);
	}
}
