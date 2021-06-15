//패키지 명
package classlist;

//학생 정보
public class Student {
	
	private String stuName; //이름
	private int stuNum; //학번
	
	//String stuName, int stuNum를 파라미터로 받는 생성자
	public Student(String stuName, int stuNum) {
		//this는 파라미터와 필드의 명칭(stuName)이 동일하기 때문에
		//필드에 해당하는 변수임을 지정하여 알려주는 역할을 한다.
		//this.stuName는 필드의 stuName이고
		//= stuName;의 stuName는 파라미터의 stuName이다.
		this.stuName = stuName;
		this.stuNum = stuNum;
	}

	//stuName 필드값을 가져오는 getter
	public String getStuName() {
		return stuName;
	}

	//stuNum 필드값을 가져오는 getter
	public int getStuNum() {
		return stuNum;
	}
	
	
}
