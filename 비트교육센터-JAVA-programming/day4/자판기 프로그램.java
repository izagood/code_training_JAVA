package review;

import java.util.Scanner;

public class ChangeMoney {
	Scanner sc = new Scanner(System.in);
	
	int input_command, input_coin, balance, payment, volum, won_500, won_100, won_50, won_10, won_1, drink_can;
	boolean sel_button, return_button;
	 
	void val_init() {
	    drink_can = 200;
	    sel_button = false;
	    return_button = false;
	}
	 
	void push_sel_button() {
	    if (sel_button == false) {
	        if (balance < 200) {
	            System.out.println("잔액이 부족합니다.");
	            System.out.println("동전을 넣어주세요.");
	            System.out.println();
	            ready_state();
	        }
	        else if (balance >= 200) {
	            sel_button = true;
	            System.out.println("몇 잔 시키시겠습니까?\n");
	            System.out.print("입력 : ");
	            volum = sc.nextInt();
	            System.out.printf("%d 잔을 시키셨습니다.\n", volum);
	            balance = balance - (drink_can * volum);
	            System.out.printf("지불금액은 %d 이고 잔액은 %d 입니다.\n", drink_can * volum, balance);
	            sel_button = false;
	            auto_return();
	            ready_state();
	        }
	    }
	 
	}
	 
	void push_return_button() {
	    return_fun();
	 
	}
	 
	void auto_return() {
	    if (balance < 200) {
	        System.out.printf("잔액이 200원 미만이라 잔돈을 반환합니다.\n");
	        return_fun();
	 
	    }
	}
	 
	void return_fun() {
	    System.out.printf("잔돈 : %d 원\n\n", balance);
	     
	    won_500 = balance / 500;
	    won_100 = (balance % 500) / 100;
	    won_10 = (balance % 100) / 10;
	    won_1 = balance % 10;
	 
	    if (won_500 != 0) {
	    	System.out.printf("500원 : %d 개\n", won_500);
	    	System.out.printf("100원 : %d 개\n", won_100);
	    	System.out.printf(" 10원 : %d 개\n", won_10);
	    	System.out.printf("  1원 : %d 개\n", won_1);
	    }
	    else if (won_100 != 0) {
	    	System.out.printf("100원 : %d 개\n", won_100);
	    	System.out.printf(" 10원 : %d 개\n", won_10);
	    	System.out.printf("  1원 : %d 개\n", won_1);
	    }
	    else if (won_10 != 0) {
	    	System.out.printf(" 10원 : %d 개\n", won_10);
	    	System.out.printf("  1원 : %d 개\n", won_1);
	    }
	    else if (won_1 != 0) {
	    	System.out.printf("  1원 : %d 개\n", won_1);
	    }
	 
	    balance = 0;
	    ready_state();
	}
	 
	void insert_coin() {
		System.out.printf("얼마를 넣으시겠습니까?\n");
		System.out.printf("금액 입력 : ");
	    input_coin = sc.nextInt();
	    System.out.printf("\n");
	    if (input_coin < 0) {
	    	System.out.printf("금액은 양의 정수 입니다.\n\n");
	        ready_state();
	    }
	    System.out.printf("%d 원을 넣으셨습니다.\n", input_coin);
	    balance = balance + input_coin;
	    if (balance < 200) {
	        auto_return();
	    }
	    else if (balance >= 200) {
	        push_sel_button();
	    }
	}
	 
	 
	void ready_state() {
		System.out.printf("\n***자판기 프로그램 ***\n\n");
		System.out.printf("명령어를 입력하세요\n\n");
		System.out.printf("( 1: 동전넣기 2: 음료 지급 버튼 3: 잔돈 반환 버튼 0: 종료 )\n\n");
		System.out.printf("입력 : ");
	    input_command = sc.nextInt();
	    System.out.printf("\n");
	    if (input_command == 1) {
	        insert_coin();
	    }
	    else if (input_command == 2) {
	        push_sel_button();
	    }
	    else if (input_command == 3) {
	        push_return_button();
	    }
	    else if (input_command == 0) {
	    	System.out.printf("프로그램을 종료합니다.\n");
	        System.exit(0);
	    }
	    else {
	    	System.out.printf("잘못된 입력입니다.\n\n\n");
	        ready_state();
	    }
	     
	 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    ChangeMoney cm = new ChangeMoney();
		
		cm.val_init();
		cm.ready_state();
		 
		

	}

}
