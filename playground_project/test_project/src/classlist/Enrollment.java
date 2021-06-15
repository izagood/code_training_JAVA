//패키지 명
package classlist; 

//클래스 import
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//수업 등록
public class Enrollment {
	
	private StudyClass studyClass; //수업 정보
	//new HashMap<>()로 HashMap 인스턴스를 생성하고 Map 인터페이스에 할당하였다.
	//Map 인터페이스에 할당하면 추후에 Map 인터페이스를 구현(implements)하는
	//다른 클래스(Map)로 쉽게 변경 가능하다.
	private Map<Student, Integer> enrollmentTable = new HashMap<Student, Integer>(); // <학생, 점수> 테이블

	//StudyClass를 파라미터로 받는 생성자
	public Enrollment(StudyClass studyClass) {
		this.studyClass = studyClass;
	}

	//학생 등록
	public void regStu(Student student, int score) {
		//HashMap 클래스에 student - 키(key), score - 값(value) 형식으로 등록함.
		//put() 함수가 HashMap 등록 함수임.
		enrollmentTable.put(student, score);
		
		//등록된 값을 console에 출력하기 위해서 System.out.println()를 호출함.
		//studyClass 인스턴스 내부에 getClassName()함수를 호출해서 className 필드를 가져옴
		//student 인스턴스 내부에 getStuName()함수를 호출해서 stuName 필드를 가져옴.
		System.out.println(studyClass.getClassName() + "반 " + student.getStuName() + "등록");
	}

	//학생 등록 취소
	public void regCancel(Student student) {
		//remove() 함수를 통해서 student - 키(key)를 가진 key-value 쌍을 제거함
		enrollmentTable.remove(student);
		System.out.println(studyClass.getClassName() + "반 " +student.getStuName() + "취소");
	}

	//학생 리스트 출력
	public void classStuList() {
		System.out.println(studyClass.getClassName() + "학생리스트 출력");
		
		//HashMap 클래스는 순서가 없기 때문에 Array처럼 반복문(for)을 돌릴 수 없기 때문에
		//enrollmentTable 인스턴스의 keySet() -> 키들의 집합을 
		//iterator() -> 반복가능한 Iterator 인터페이스로 리턴 받는다.
		//Iterator<Student> -> Iterator<키의 집합이므로 키의 클래스를 받아야 한다.>
		Iterator<Student> students = enrollmentTable.keySet().iterator();
		
		//students에 다음 값이 존재하면 true를 리턴한다.
		//students에 다음 값이 존재하는한 반복문이 계속 된다.
		while(students.hasNext()) {
			//next() 함수로 다음 키값을 리턴 받는다.
			Student student = students.next();
			
			System.out.println(student.getStuName());
		}
	}

	//분반 평균 출력
	public void showClassArg() {
		System.out.println(studyClass.getClassName() + "평균 출력");
		//size() 함수를 통해 enrollmentTable의 key-value 쌍의 크기를 알 수 있다.
		int stuCnt = enrollmentTable.size();
		double sum = 0;
		
		Iterator<Student> students = enrollmentTable.keySet().iterator();
		while(students.hasNext()) {
			Student student = students.next();
			//get() 함수를 사용해서 student 키에 해당하는 값(value)를 리턴받는다.
			Integer integer = enrollmentTable.get(student);
			
			//점수를 모두 더해준다.
			sum += integer;
		}
		
		//평균값이 소수점으로 나오기 때문에 stuCnt를 double로 캐스팅(강제 형변환)해준다.
		double arg = sum / (double) stuCnt ;
		System.out.println(studyClass.getClassNum() + " 분반 평균 : "+ arg);
		
	}
}
