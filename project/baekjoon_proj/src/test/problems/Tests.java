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
import baekjoon_proj.problems.stepbystep.no6.HanSu_1065;
import baekjoon_proj.problems.stepbystep.no7.AsciiCode_11654;

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
}
