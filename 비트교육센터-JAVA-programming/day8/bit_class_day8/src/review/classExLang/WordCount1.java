package review.classExLang;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WordCount1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			String input = sc.nextLine();
		    String[] word = input.split(" ");
			System.out.println("어절의 개수는 " + word.length);
			break;
			
		}	
	}
}
