package baekjoon_proj.problems.stepbystep.no7;

import java.util.Scanner;

/**
 * @문제
 * 알파벳 소문자로만 이루어진 단어 S가 주어진다. 
 * 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 
 * 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
 * 
 * @author mcnc
 *
 */
public class Alpabet_10809 {
	char[] alpabetArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
	int[] alpabetIndex = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
	
	
	public void alpabet() {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		scanner.close();
		
		for(int i=0; i<input.length(); i++) {
			char charAt = input.charAt(i);
			
			for(int j=0; j<alpabetArray.length; j++) {
				if(charAt == alpabetArray[j]) {
					if(alpabetIndex[j] == -1) {
						alpabetIndex[j] = i;
					}
				}
			}
		}
		
		for(int k=0; k<alpabetIndex.length; k++) {
			if(k < alpabetIndex.length - 1) {
				System.out.print(alpabetIndex[k]+ " ");
			}else {
				System.out.print(alpabetIndex[k]);
			}
		}
	}
}
