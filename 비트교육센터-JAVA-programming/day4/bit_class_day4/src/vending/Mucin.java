package vending;

import java.util.Scanner;

public class Mucin {
	Scanner sc = new Scanner(System.in);
	
	long balance = 0;
	long won_50000, won_10000, won_1000, won_500, won_100, won_50, won_10, won_1;
	boolean sel_button, return_button;

	
	void input_fun() {
		System.out.println();
		System.out.print("금액 입력: ");
	    balance = sc.nextLong();
	}
	
	void change_money_fun() {
	    
		won_50000 = balance / 50000;
		won_10000 = (balance %50000)/10000;
	    won_1000 = ((balance%50000)%10000)/1000;
	    won_500 = (((balance%50000)%10000)%1000)/500;
	    won_100 = ((((balance%50000)%10000)%1000)%500) / 100;
	    won_10 = (((((balance%50000)%10000)%1000)%500)%100) / 10;
	    won_1 = balance % 10;
	    
	    if (won_50000 != 0) {
	    	System.out.printf("50000원 : %5d 개\n", won_50000);
	    	System.out.printf("10000원 : %5d 개\n", won_10000);
	    	System.out.printf(" 1000원 : %5d 개\n", won_1000);
	    	System.out.printf("  500원 : %5d 개\n", won_500);
	    	System.out.printf("  100원 : %5d 개\n", won_100);
	    	System.out.printf("   10원 : %5d 개\n", won_10);
	    	System.out.printf("    1원 : %5d 개\n", won_1);	
	    }
	    else if (won_10000 != 0) {
	    	System.out.printf("10000원 : %5d 개\n", won_10000);
	    	System.out.printf(" 1000원 : %5d 개\n", won_1000);
	    	System.out.printf("  500원 : %5d 개\n", won_500);
	    	System.out.printf("  100원 : %5d 개\n", won_100);
	    	System.out.printf("   10원 : %5d 개\n", won_10);
	    	System.out.printf("    1원 : %5d 개\n", won_1);	
	    }
	    else if (won_1000 != 0) {
	    	System.out.printf("1000원 : %5d 개\n", won_1000);
	    	System.out.printf(" 500원 : %5d 개\n", won_500);
	    	System.out.printf(" 100원 : %5d 개\n", won_100);
	    	System.out.printf("  10원 : %5d 개\n", won_10);
	    	System.out.printf("   1원 : %5d 개\n", won_1);	
	    }
	    else if (won_500 != 0) {
	    	System.out.printf("500원 : %5d 개\n", won_500);
	    	System.out.printf("100원 : %5d 개\n", won_100);
	    	System.out.printf(" 10원 : %5d 개\n", won_10);
	    	System.out.printf("  1원 : %5d 개\n", won_1);
	    }
	    else if (won_100 != 0) {
	    	System.out.printf("100원 : %5d 개\n", won_100);
	    	System.out.printf(" 10원 : %5d 개\n", won_10);
	    	System.out.printf("  1원 : %5d 개\n", won_1);
	    }
	    else if (won_10 != 0) {
	    	System.out.printf(" 10원 : %5d 개\n", won_10);
	    	System.out.printf("  1원 : %5d 개\n", won_1);
	    }
	    else if (won_1 != 0) {
	    	System.out.printf("  1원 : %d 개\n", won_1);
	    }
	 
	    balance = 0;
	    
	}
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Mucin mc = new Mucin();
		
	    mc.input_fun();
		mc.change_money_fun();
	}
}
