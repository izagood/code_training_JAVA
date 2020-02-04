package basic.first;

public class HelloJava {

	public static void main(String[] args) {
		
	    Person a1 = new Person();
	    Person a2 = new Person();
	    Person a3 = new Person();
        
	    a2.name = "홍길동";
	    a2.eye = 1;
	    a1.eye = 2;
	    a2.study();
	    a1.eat();
	}

}
