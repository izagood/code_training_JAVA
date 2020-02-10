package basic01;

public class CircleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Circle c1 = new Circle(2, "첫번째 ");
        
        Circle c2 = new Circle(5);
        
        System.out.println(c1.name + "의 넓이는 " + c1.getArea());
        System.out.println(c2.name);
	}

}
