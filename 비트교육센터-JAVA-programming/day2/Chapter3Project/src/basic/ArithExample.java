package basic;

import java.util.Scanner;

public class ArithExample {
    public static void main(String[] args) {
//    	int time, second, minute, hour;
//    	
//    	Scanner sc = new Scanner(System.in);
//    	System.out.print("정수를 입력하세요: ");
//        time = sc.nextInt();
//        
//        second = time % 60;
//        minute = (time/60)%60;
//        hour = (time/60)/60;
//        
//        System.out.printf("%02d 시 ", hour);
//
//        System.out.printf("%02d 분 ", minute);
//
//        System.out.printf("%02d 초 ", second);
//        System.out.println();
//        
//        String s1 = "안녕";
//        String s2 = "자바";
//        String result = s1 + " "+ s2;
//        System.out.println(result);
        
        String i1 = "여름";
        String i2 = new String("여름");
        if(i1.equals(i2)) {
        	System.out.println("같다");
        }else {
        	System.out.println("다르다");
        }
    }
}
