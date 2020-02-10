package basic01;

public class Circle {
	
	private String name;
	public int radius;
	
	double getArea() {
		
		double result = 3.14 * radius * radius;
		return result;
	}
	
	public Circle(int radius, String name){
		this.radius = radius;
		this.name = name;
	}
	
	public Circle(int radius){
		this(radius, "기본원");
		
	}
	
	

}
