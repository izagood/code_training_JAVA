package baekjoon_proj.problems.stepbystep.no7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 * @문제
 * 전화를 걸고 싶은 번호가 있다면, 숫자를 하나를 누른 다음에 금속 핀이 있는 곳 까지 시계방향으로 돌려야 한다.
 * 숫자를 하나 누르면 다이얼이 처음 위치로 돌아가고, 
 * 다음 숫자를 누르려면 다이얼을 처음 위치에서 다시 돌려야 한다.
 * 숫자 1을 걸려면 총 2초가 필요하다.
 * 1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며, 한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.
 * 상근이의 할머니는 전화 번호를 각 숫자에 해당하는 문자로 외운다.
 * 즉, 어떤 단어를 걸 때, 각 알파벳에 해당하는 숫자를 걸면 된다.
 * 예를 들어, UNUCIC는 868242와 같다.
 * 할머니가 외운 단어가 주어졌을 때, 이 전화를 걸기 위해서 필요한 최소 시간을 구하는 프로그램을 작성하시오.
 * 
 * 868242 -> 9 7 9 3 5 3 -> 36
 * 
 * 
 * @author mcnc
 *
 */
public class Dial_5622 {

	public void dial() {
		Map<String, Integer> dialNums = new HashMap<>();
		dialNums.put("a", 2);
		dialNums.put("b", 2);
		dialNums.put("c", 2);
		dialNums.put("d", 3);
		dialNums.put("e", 3);
		dialNums.put("f", 3);
		dialNums.put("g", 4);
		dialNums.put("h", 4);
		dialNums.put("i", 4);
		dialNums.put("j", 5);
		dialNums.put("k", 5);
		dialNums.put("l", 5);
		dialNums.put("m", 6);
		dialNums.put("n", 6);
		dialNums.put("o", 6);
		dialNums.put("p", 7);
		dialNums.put("q", 7);
		dialNums.put("r", 7);
		dialNums.put("s", 7);
		dialNums.put("t", 8);
		dialNums.put("u", 8);
		dialNums.put("v", 8);
		dialNums.put("w", 9);
		dialNums.put("x", 9);
		dialNums.put("y", 9);
		dialNums.put("z", 9);
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next().toLowerCase();
		scanner.close();
		int totalSum = 0;
		for(int i=0; i<input.length(); i++) {
			char charAt = input.charAt(i);
			String str = String.valueOf(charAt);
			Integer tempNum = dialNums.get(str);
			totalSum += tempNum + 1;
		}
		System.out.println(totalSum);
		
	}
}
