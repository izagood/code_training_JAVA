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
}
