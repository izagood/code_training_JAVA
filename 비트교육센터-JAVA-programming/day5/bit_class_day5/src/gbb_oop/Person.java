package gbb_oop;

public class Person {
	
	String name, colorHair, studentnumber;
	int age;
    
    
    
    
    int study(){
    	
    	int a;
    	return a;
    }
    
    Person(String name){
    	this.name = name;
    }
    
    Person(){
    	this("무명");
    	System.out.println("또다른...");
    }
    
    public static void main(String[] args) {
    	Person p1 = new Person();
    	
    	System.out.println(p1);
    }
    
	
	

}
