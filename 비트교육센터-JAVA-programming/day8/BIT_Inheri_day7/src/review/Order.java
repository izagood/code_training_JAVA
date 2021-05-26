package review;

public class Order {
	
	void productOrder(Person p, Payment pay){
		System.out.println(p.getName() + "(id: "+ p.getId()+") ¥‘¿Ã " + pay.pay() +"∑Œ ∞·¡¶!" );
	}

}
