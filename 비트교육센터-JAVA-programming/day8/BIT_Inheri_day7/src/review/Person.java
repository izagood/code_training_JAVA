package review;

public class Person {
	static int memberId;
	private String name;
	private int id;
	Person(String name){
		this.name = name;
		id=++memberId;
	}
	public String getName(){
		return name;
	}
	public int getId(){
		return id;
	}
}
