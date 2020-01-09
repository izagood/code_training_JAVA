package week02.d3.ch5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashTable {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("11082917", "Apple iPhone 11");
        map.put("12082917", "Apple iPhone 11 pro");
        map.put("13082917", "Apple iPhone XS");
        map.put("14082917", "Apple iPhone X");

        Scanner sc = new Scanner(System.in);
        System.out.print("# 검색할 상품 코드: ");
        String code = sc.next();
        System.out.printf("%s : %s \n", code, map.get(code));

        System.out.println("------키 와 값을 출-----------");
        for(String s : map.keySet()){
            System.out.printf("%s : %s \n", s, map.get(s));

        }
        System.out.println("-------값만 출력----------");
        for(String s : map.values()){
            System.out.printf("%s \n", s);

        }
        System.out.println("-------모두 출력----------");
        for(Map.Entry<String, String> entry : map.entrySet()) {
            System.out.printf("%s : %s \n", entry.getKey(), entry.getValue());
        }
    }
}
