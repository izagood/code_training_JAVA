package classlist;


public class App {
	
	public static void main(String[] args) {
		Student student1 = new Student("학생1", 1);
		Student student2 = new Student("학생2", 2);
		Student student3 = new Student("학생3", 3);
		
		StudyClass class1 = new StudyClass("수업1", 1); 
		StudyClass class2 = new StudyClass("수업2", 2); 
		
		Enrollment enr1 = new Enrollment(class1);
		enr1.regStu(student1, 80);
		enr1.regStu(student2, 73);
		
		enr1.regCancel(student1);
		
		enr1.classStuList();
		enr1.showClassArg();
		
		Enrollment enr2 = new Enrollment(class2);
		enr2.regStu(student2, 42);
		enr2.regStu(student3, 73);
		
		enr2.classStuList();
		enr2.showClassArg();
		
	}

}
