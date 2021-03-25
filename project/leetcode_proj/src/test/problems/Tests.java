package test.problems;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import leetcode_proj.problems.PalindromeNumber;
import leetcode_proj.problems.ReverseInteger;
import leetcode_proj.problems.TwoSum;

public class Tests {
	
	@Test
	@DisplayName("target의 합이 있는 인덱스를 내보냄")
	public void twoSumTest() throws Exception {
		TwoSum solution = new TwoSum();
		
		int[] nums = {2, 7, 11, 15};
		
		int target = 9;
		
		int[] returnNums = solution.twoSum(nums, target);
		
		System.out.print("[");
		for(int i=0; i<returnNums.length; i++) {
			System.out.print(returnNums[i]);
			if(i+1 < returnNums.length) {
				System.out.print(",");
			}
		}
		System.out.print("]");
	}
	
	@Test
	@DisplayName("입력된 숫자를 반대 순서로 출력한다.(마이너스도)")
	public void ReverseIntegerTest() throws Exception {
		ReverseInteger solution = new ReverseInteger();
		
		int input = 123;
		
		int num = solution.mainFunc(input);
		System.out.println(num);
	}
	
	@Test
	@DisplayName("좌우 대칭인 숫자")
	void palindromeNumberTest() {
		PalindromeNumber solution = new PalindromeNumber();
		
		int input = 121;
		
		boolean result = solution.isPalindrome(input);
		
		System.out.println(result);
		
	}
	
	@Test
	@DisplayName("로마 숫자 -> 숫자로 변환")
	void RomanToIntegerTest() {
		
	}
}
