package review.classExLang;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> hashmap = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		String search = "";

		while (true) {
			System.out.print("나라 이름과 인구를 5개 입력하세요.(예: Korea 5000\n");
			for (int i = 0; i < 5; i++) {
				String input_s = sc.next();
				if (input_s.equals("그만")) {
					break;
				}
				Integer input_i = sc.nextInt();
				hashmap.put(input_s, input_i);
			}
			while (true) {
				System.out.print("인구 검색 >> ");
				search = sc.next();
				if (search.equals("그만")) {
					break;
				}
				Integer score = hashmap.get(search);
				if (score == null) {
					System.out.println("그런 나라 없음");
				} else {
					System.out.println("인구: " + score);
				}
			}

		}

	}

}
