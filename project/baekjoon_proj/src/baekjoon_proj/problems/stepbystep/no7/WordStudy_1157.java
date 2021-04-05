package baekjoon_proj.problems.stepbystep.no7;

import java.util.Scanner;

/**
 * @문제
 * 알파벳 대소문자로 된 단어가 주어지면, 
 * 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
 * 단, 대문자와 소문자를 구분하지 않는다.
 * 
 * @author mcnc
 *
 */
public class WordStudy_1157 {
	char[] alpabetArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
	int[] alpabetIndex = new int[26];
	
	public void study() {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.next();
		String lowerInput = input.toLowerCase();
		scanner.close();
		
		for(int i=0; i<input.length(); i++) {
			char charAt = lowerInput.charAt(i);
			
			for(int j=0; j<alpabetArray.length; j++) {
				if(charAt == alpabetArray[j]) {
					alpabetIndex[j]++;
				}
			}
		}
		
		int index = 0;
		int max = 0;
		for(int k=0; k<alpabetIndex.length; k++) {
			if(alpabetIndex[k] > max) {
				max = alpabetIndex[k];
				index = k;
			}
		}
		
		int count = 0;
		for(int l=0; l<alpabetIndex.length; l++) {
			if(max == alpabetIndex[l]) {
				count++;
			}
		}
		
		if(count > 1) {
			System.out.println("?");
		}else {
			char result = alpabetArray[index];
			String resultStr = String.valueOf(result);
			System.out.println(resultStr.toUpperCase());
		}
		
	}
}