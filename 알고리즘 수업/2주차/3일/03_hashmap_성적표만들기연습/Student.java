package week02.d3.ch5;

import java.util.List;

public class Student {
    private String id;
    private String name;
    private String dept;
    private List<Integer> sungjuk;

    //getter, setter를 이용해 접근

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public List<Integer> getSungjuk() {
        return sungjuk;
    }

    public void setSungjuk(List<Integer> sungjuk) {
        this.sungjuk = sungjuk;
    }

}
