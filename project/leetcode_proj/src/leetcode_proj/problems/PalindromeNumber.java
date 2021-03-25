package leetcode_proj.problems;

public class PalindromeNumber {
	
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }else if(x == 0){
            return true;
        }else{
            int xLength = (int) Math.log10(x) + 1;
            int count = xLength / 2;
            
            // 뒤에서 count개수 만큼 pop 한 후 reverse
            int temp1 = x;
            int backX = 0;
            for(int i = 0; i<count; i++){
                int pop = temp1 % 10;
                temp1 /= 10;
                
                backX = backX * 10 + pop;
            }
            
            // 앞에서 부터 count 개수 만큼 자르기
            int temp2 = x;
            int frontX = temp2 / (int) Math.pow(10, xLength - count);
            
            if(backX == frontX){
                return true;
            }else{
                return false;
            }
        }
    }
    
}
