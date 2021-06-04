package arrayEx;
public class ScoreAverage {
	public static void main(String[] args) {
		/* <다차원 배열 생성 1>
		 * int intArray[][] = new int[2][3];
		   intArray[0][0] = 36 ; ....
		   
		   <다차원 배열 생성 2>
		   int intArray1[][] = new int[2][];
		   intArray1[0] = new int[3];
		   intArray1[1] = new int[2];
		   
		   <다차원 배열 생성 3>
		   int intArray[][] = {{0,1}{15, 3}};   		 		
		 */		
		
		double score[][] = {{3.3, 3.4},	// 1학년 1, 2학기 평점
							{3.5, 3.6},	// 2학년 1, 2학기 평점
							{3.7, 4.0},	// 3학년 1, 2학기 평점
							{4.1, 4.2} };	// 4학년 1, 2학기 평점
		double sum=0;
		for(int year=0; year<score.length; year++) // 각 학년별로 반복
			for(int term=0; term<score[year].length; term++) // 각 학년의 학기별로 반복
				sum += score[year][term]; // 전체 평점 합

		
		int n=score.length; // 배열의 행 개수, 4
		int m=score[0].length; // 배열의 열 개수, 2
		System.out.println("4년 전체 평점 평균은 " + sum/(n*m));
	}
}