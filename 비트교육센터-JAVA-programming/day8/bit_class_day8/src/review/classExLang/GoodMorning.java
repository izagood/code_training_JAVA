package review.classExLang;

import java.util.Calendar;

public class GoodMorning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
		
	    int hour = calendar.get(Calendar.HOUR_OF_DAY);
	    int min = calendar.get(Calendar.MINUTE);
	    
	    System.out.println("현재 시간은 "+hour+"시 "+min+"분 입니다.");
		
	    if(hour<12) {
	    	System.out.println("오전");
	    }
	    else if(hour>=12) {
	    	System.out.println("오후");
	    }

	}

}
