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
import baekjoon_proj.problems.stepbystep.no5.OX_8958;
import baekjoon_proj.problems.stepbystep.no5.OverAverage_4344;
import baekjoon_proj.problems.stepbystep.no6.IntegerNSum_15596;
import baekjoon_proj.problems.stepbystep.no6.SelfNum_4673;
import baekjoon_proj.problems.stepbystep.no6.HanSu_1065;
import baekjoon_proj.problems.stepbystep.no7.Alpabet_10809;
import baekjoon_proj.problems.stepbystep.no7.AsciiCode_11654;
import baekjoon_proj.problems.stepbystep.no7.CroaAlpabet_2941;
import baekjoon_proj.problems.stepbystep.no7.Dial_5622;
import baekjoon_proj.problems.stepbystep.no7.SangSu_2908;
import baekjoon_proj.problems.stepbystep.no7.StringRepetition_2675;
import baekjoon_proj.problems.stepbystep.no7.WordStudy_1157;
import baekjoon_proj.problems.stepbystep.no7.WordsNum_1152;

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
	}
	
	@Test
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
	}
	
	@Test
	@DisplayName("알파벳 찾기")
	void alpabet_10809() throws IOException {
		Alpabet_10809 alpabet_10809 = new Alpabet_10809();
		alpabet_10809.alpabet();
	}
	
	@Test
	@DisplayName("문자열 반복")
	void stringRepetition_2675() throws IOException {
		StringRepetition_2675 stringRepetition_2675 = new StringRepetition_2675();
		stringRepetition_2675.repetition();
	}
	
	@Test
	@DisplayName("단어 공부")
	void wordStudy_1157() throws IOException {
		WordStudy_1157 wordStudy_1157 = new WordStudy_1157();
		wordStudy_1157.study();
	}
	
	@Test
	@DisplayName("단어의 개수")
	void wordsNum_1152() throws IOException {
		WordsNum_1152 wordsNum_1152 = new WordsNum_1152();
		wordsNum_1152.words();
	}
	
	@Test
	@DisplayName("상수")
	void const_2908() throws IOException {
		SangSu_2908 sangSu_2908 = new SangSu_2908();
		sangSu_2908.sangSuNum();
	}
	
	@Test
	@DisplayName("다이얼")
	void dial_5622() throws IOException {
		Dial_5622 dial_5622 = new Dial_5622();
		dial_5622.dial();
	}
	
	@Test
	@DisplayName("크로아티아 알파벳")
	void croaAlpabet_2941() throws IOException {
		CroaAlpabet_2941 croaAlpabet_2941 = new CroaAlpabet_2941();
		croaAlpabet_2941.cora();
	}
}
