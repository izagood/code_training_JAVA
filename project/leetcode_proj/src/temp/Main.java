package temp;

public class Main {
	
	private int fuel;
	private int speed;
	private String color;
	
	public Main(int fuel, int speed, String color) {
		super();
		this.fuel = fuel;
		this.speed = speed;
		this.color = color;
	}

	public int getFuel() {
		return fuel;
	}

	public void setFuel(int fuel) {
		this.fuel = fuel;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
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
	
	public static void main(String[] args) {
		Main main = new Main(100, 20, "red");
		System.out.println(main.speed);
		main.accelerate();
		System.out.println(main.speed);
		main.Break();
		System.out.println(main.speed);
	}
}
