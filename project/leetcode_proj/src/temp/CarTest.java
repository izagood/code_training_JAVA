package temp;

class Car {
	private int fuel;
	private int speed;
	private String color;
	
	public Car(int fuel, int speed, String color) {
		super();
		this.fuel = fuel;
		this.speed = speed;
		this.color = color;
	}
	
	public void setFuel(int fuel) {
		if(fuel < 10) {
			System.out.println("fuel value less than 10");
		}else {
			this.fuel = fuel;
		}
	}
	public int getFuel() {
		return fuel;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSpeed() {
		return speed;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	
	public void accelerate() {
		speed += 10;
	}
	
	public void Break() {
		speed -= 10;
		if(speed == 0) {
			System.out.println("멈춤");
		}
	}
}

public class CarTest {
	public static void main(String[] args) {
		Car carObject = new Car(100, 20, "red");
		System.out.println(carObject.getSpeed());
		carObject.accelerate();
		System.out.println(carObject.getSpeed());
		System.out.println(carObject.getColor());
		carObject.Break();
		carObject.Break();
		carObject.Break();
		System.out.println(carObject.getSpeed());
	}
}
