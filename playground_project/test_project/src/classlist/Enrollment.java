package classlist;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Enrollment {
	
	private StudyClass studyClass;
	private Map<Student, Integer> enrollmentTable = new HashMap<Student, Integer>();
	

	public Enrollment(StudyClass studyClass) {
		this.studyClass = studyClass;
	}

	public void regStu(Student student, int score) {
		enrollmentTable.put(student, score);
		System.out.println(studyClass.getClassName() + "반 " + student.getStuname() + "등록");
	}

	public void regCancel(Student student) {
		enrollmentTable.remove(student);
		System.out.println(studyClass.getClassName() + "반 " +student.getStuname() + "취소");
	}

	public void classStuList() {
		System.out.println(studyClass.getClassName() + "학생리스트 출력");
		
		Iterator<Student> students = enrollmentTable.keySet().iterator();
		while(students.hasNext()) {
			Student student = students.next();
			System.out.println(student.getStuname());
		}
	}

	public void showClassArg() {
		System.out.println(studyClass.getClassName() + "평균 출력");
		int stuCnt = enrollmentTable.size();
		double sum = 0;
		
		Iterator<Student> students = enrollmentTable.keySet().iterator();
		while(students.hasNext()) {
			Student student = students.next();
			Integer integer = enrollmentTable.get(student);
			sum += integer;
		}
		
		double arg = sum / (double) stuCnt ;
		System.out.println(studyClass.getClassNum() + " 분반 평균 : "+ arg);
		
	}
}
