package leetcode_proj.problems;

public class ReverseInteger {
	
    public int mainFunc(int x) throws Exception{
        int singleDigit = 0;
        int xLength = (int) (Math.log10(x) + 1);
        int reverseX =0;
        
        int[] reverseXarr = new int[xLength];

        for(int i=0; i< xLength; i++){
            singleDigit = x % 10;
            x = x / 10;
            reverseXarr[i] = singleDigit;
        }
        
        for(int i=0; i< xLength; i++){
            reverseX += (reverseXarr[i] * (int) Math.pow(10, xLength-i-1));
        }
        
        return reverseX;
    }
    
    public int reverse(int x) {
        try{
        int reverseX = 0;
        int max = (int) Math.pow(2,31) - 1;
        int min = -((int) Math.pow(2,31));
        
        if(x > max || x< min){
            return 0;
        }else{
           if(x < 0){
                x = Math.abs(x);
                reverseX = mainFunc(x);
                return -reverseX;
            }else{
                reverseX = mainFunc(x);
                return reverseX;
            } 
        }
        }catch(Exception e){
            return 0;
        }
    }
    
}
