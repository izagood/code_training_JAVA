//패키지 명
package classlist;

//수업 정보
public class StudyClass {
	
	private String className; //수업명
	private int classNum; //분반
	
	//String className, int classNum를 파라미터로 받는 생성자
	public StudyClass(String className, int classNum) {
		this.className = className;
		this.classNum = classNum;
	}

	//className 필드값을 가져오는 getter
	public String getClassName() {
		return className;
	}

	//classNum 필드값을 가져오는 getter
	public int getClassNum() {
		return classNum;
	}
	
}
