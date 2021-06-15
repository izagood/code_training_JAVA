//패키지 명
package classlist;


public class App {
	
	/*
	 * # 프로그램 설명
	 * 
	 * # 클래스 설명
	 * Enrollment는 수업 등록
	 * StudyClass는 수업 정보
	 * Student는 학생 정보
	 * 
	 * # 인스턴스 생성
	 * Student student1 = new Student("학생1", 1);
	 * StudyClass class1 = new StudyClass("수업1", 1); 
	 * 학생(Student)과 수업(StudyClass)에 대한 인스턴스를 생성하고
	 * 
	 * # 클래스 매핑
	 * Enrollment enr1 = new Enrollment(class1);
	 * enr1.regStu(student1, 80);
	 * 수업 등록(Enrollment) 생성자로 StudyClass를 매핑(연결)해주고
	 * regStu 함수를 통해서 Student와 매핑해주어
	 * class1 파라미터로 생성된 Enrollment 인스턴스 내부에서
	 * Student, StudyClass 클래스를 매핑
	 * 그래서 class1 수업에 여러 명의 student1, student2 등을 등록 가능하게 됨.
	 * (수업 등록 클래스를 생성하지 않으면 매핑해주는 클래스가 없기 때문에 로직
	 * 이 복잡해짐)
	 */
	
	//main 함수 프로그램 실행시 제일 먼저 시작됨.
	public static void main(String[] args) {
		
		//new '클래스 이름'으로 클래스를 복제한 인스턴스를 만들 수 있음.
		//생성자를 통해서 변수(파라미터)를 넣어주고 Student 인스턴스를 생성
		Student student1 = new Student("학생1", 1);
		Student student2 = new Student("학생2", 2);
		Student student3 = new Student("학생3", 3);
		
		//StudyClass 인스턴스를 생성
		StudyClass class1 = new StudyClass("수업1", 1); 
		StudyClass class2 = new StudyClass("수업2", 2); 
		
		//Enrollment 인스턴스를 생성
		Enrollment enr1 = new Enrollment(class1);
		//Enrollment 인스턴스 enr1에 있는 regStu 함수를 통해 학생을 등록함
		enr1.regStu(student1, 80);
		enr1.regStu(student2, 73);
		
		//regCancel 함수를 통해 student1 학생의 등록을 취소함
		enr1.regCancel(student1);
		
		//classStuList 함수를 통해 학생 리스트를 출력함
		enr1.classStuList();
		//showClassArg 함수를 통해 분반 평균 출력
		enr1.showClassArg();
		
		Enrollment enr2 = new Enrollment(class2);
		enr2.regStu(student2, 42);
		enr2.regStu(student3, 73);
		
		enr2.classStuList();
		enr2.showClassArg();
		
	}

}
