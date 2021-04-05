package test.problems;

import java.io.IOException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import baekjoon_proj.problems.stepbystep.no1.HelloWorld_2557;
import baekjoon_proj.problems.stepbystep.no1.WeLoveKriii_10718;
import baekjoon_proj.problems.stepbystep.no2.Grade_9498;
import baekjoon_proj.problems.stepbystep.no2.PickQuadrant_14681;
import baekjoon_proj.problems.stepbystep.no2.TwoNumer_1330;
import baekjoon_proj.problems.stepbystep.no2.Years4_2753;
<<<<<<< HEAD
import baekjoon_proj.problems.stepbystep.no5.OX_8958;
import baekjoon_proj.problems.stepbystep.no5.OverAverage_4344;
import baekjoon_proj.problems.stepbystep.no6.IntegerNSum_15596;
import baekjoon_proj.problems.stepbystep.no6.SelfNum_4673;
=======
import baekjoon_proj.problems.stepbystep.no6.HanSu_1065;
import baekjoon_proj.problems.stepbystep.no7.AsciiCode_11654;
>>>>>>> 0c064b789acced06146e983e43b19f4b75fac695

public class Tests {
	@Test
	@DisplayName("기본 출력")
	void helloWorld_2557() {
		HelloWorld_2557 helloWorld = new HelloWorld_2557();
		helloWorld.helloWorld();
	}
	
	@Test
	@DisplayName("기본 출력")
	void weLoveKriii_10718() {
		WeLoveKriii_10718 weLoveKriii = new WeLoveKriii_10718();
		weLoveKriii.weLoveKriii();
	}
	
	@Test
	@DisplayName("기본 출력")
	void twoNumer_1330() throws IOException {
		TwoNumer_1330 twoNumer_1330 = new TwoNumer_1330();
		twoNumer_1330.twoNumber();
	}
	
	@Test
	@DisplayName("성적 출력")
	void grade_9498() throws IOException {
		Grade_9498 grade_9498 = new Grade_9498();
		grade_9498.grade();
	}
	
	@Test
	@DisplayName("윤년")
	void years4_2753() throws IOException {
		Years4_2753 years4_2753 = new Years4_2753();
		years4_2753.year4();
	}
	
	@Test
	@DisplayName("사분면 고르기")
	void pickQuadrant_14681() throws IOException {
		PickQuadrant_14681 pickQuadrant_14681 = new PickQuadrant_14681();
		pickQuadrant_14681.pickQuadrant();
	}
	
	@Test
<<<<<<< HEAD
	@DisplayName("OX 퀴즈")
	void oX_8958() throws IOException {
		OX_8958 oX_8958 = new OX_8958();
		oX_8958.quizStringArray();
	}
	
	@Test
	@DisplayName("평균은 넘겠지")
	void overAverage_4344() throws IOException {
		OverAverage_4344 overAverage_4344 = new OverAverage_4344();
		overAverage_4344.averNextLine();
	}
	
	@Test
	@DisplayName("정수 N개의 합")
	void integerNSum_15596() throws IOException {
		IntegerNSum_15596 integerNSum_15596 = new IntegerNSum_15596();
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		long b = integerNSum_15596.sum(a);
		System.out.println(b);
	}
	
	@Test
	@DisplayName("셀프 넘버")
	void selfNum_4673() throws IOException {
		SelfNum_4673 selfNum_4673 = new SelfNum_4673();
		selfNum_4673.selfNum(10000);
=======
	@DisplayName("한수")
	void hanSu_1065() throws IOException {
		HanSu_1065 hanSu_1065 = new HanSu_1065();
		hanSu_1065.hanSu();
	}
	
	@Test
	@DisplayName("아스키 코드")
	void asciiCode_11654() throws IOException {
		AsciiCode_11654 asciiCode_11654 = new AsciiCode_11654();
		asciiCode_11654.ascii();
>>>>>>> 0c064b789acced06146e983e43b19f4b75fac695
	}
}
