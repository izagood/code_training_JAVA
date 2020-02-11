package staticEx;

public class Car {
	
	private String model;
	private String color;
	private int speed;
	private int id;
	static int numbers =0;
	
    public Car(String model, String color, int speed) {
		this(model, color, speed, id);
		this.model = model;
		this.color = color;
		this.speed = speed;
		
		id = ++numbers;
		
	}
    
    public static int getNumberOfCars() {
    	return numbers;
    }
	
}
