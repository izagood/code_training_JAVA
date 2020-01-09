package week02.d3.ch5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ScoreManagement { //해시 맵을 이용해 성적표 만들기

    Map<String, Student> data = new HashMap<>();
    Scanner sc = new Scanner(System.in);


    void genStudent(){
        Student s = new Student("20179916", "김길동", "컴퓨터공학과", Arrays.asList(90,85,92,99,91));
        data.put("20179916", s);

        s = new Student("20189916", "이길동", "생명공학과", Arrays.asList(91,88,89,90,78));
        data.put("20189916", s);

        s = new Student("20199916", "박길동", "화학공학과", Arrays.asList(94,80,98,67,61));
        data.put("20199916", s);

    }

    void findStudent(){

        System.out.print("# 검색할 학번을 입력하세요: ");
        String id = sc.next();
//        System.out.printf("%s : %s \n", id, data.get(id));

        // 학번으로 조회해서 이름, 학과, 총점, 평균 출력
        Student s = data.get(id);
        System.out.printf("이름 : %s 학과 : %s\n", s.getName(), s.getDept());
        System.out.println("--------------------------");
        int total = 0;
        for(int sj : s.getSungjuk()){
            total += sj;
        }
        System.out.printf("총점: %d 평균: %d\n", total, total/5);
        System.out.println("--------------------------");

    }

    public static void main(String[] args) {
        ScoreManagement app = new ScoreManagement();
        app.genStudent();
        app.findStudent();


    }
}
