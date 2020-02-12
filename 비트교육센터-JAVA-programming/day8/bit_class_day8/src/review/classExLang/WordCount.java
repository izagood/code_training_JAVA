package review.classExLang;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			String input = sc.nextLine();
			StringTokenizer st = new StringTokenizer(input, " ");
			System.out.println("어절의 개수는 " + st.countTokens());
			break;
			
		}	
	}
}
