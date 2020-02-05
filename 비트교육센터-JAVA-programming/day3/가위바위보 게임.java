package basic.gbb;

import java.util.Scanner;

public class GbbGame {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean run = true;
        
        String p1, p2; // p1 철수, p2 영희
        String s = "가위", r = "바위", b = "보";
        
        while(run) {
        	System.out.println();
            System.out.println("가위바위보 게임입니다.");
            System.out.println("가위, 바위, 보 중에서 입력하세요.");
            System.out.println();
        	System.out.print("철수 >> ");
        	p1 = sc.next();
        	if(!(p1.equals(s) || p1.equals(r) || p1.equals(b))) {
        	    System.out.println("다시 입력하세요.");
        	    System.out.print("철수 >> ");
        	    p1 = sc.next();
        	}
        	System.out.print("영희 >> ");
        	p2 = sc.next();
        	if(!(p2.equals(s) || p2.equals(r) || p2.equals(b))) {
        	    System.out.println("다시 입력하세요.");
        	    System.out.print("영희 >> ");
        	    p2 = sc.next();
        	}
        	
            if(p1.equals(p2)) {
            	System.out.println("비겼습니다.");
            }
            else if(p1.equals(s) && p2.equals(r)) {
            	System.out.println("영희가 이겼습니다. ");
            }
            else if(p1.equals(s) && p2.equals(b)) {
            	System.out.println("철수가 이겼습니다. ");
            }
            else if(p1.equals(r) && p2.equals(s)) {
            	System.out.println("철수가 이겼습니다. ");
            }
            else if(p1.equals(r) && p2.equals(b)) {
            	System.out.println("영희가 이겼습니다. ");
            }
            else if(p1.equals(b) && p2.equals(s)) {
            	System.out.println("영희가 이겼습니다. ");
            }
            else if(p1.equals(b) && p2.equals(r)) {
            	System.out.println("철수가 이겼습니다. ");
            }
        }

	}

}
