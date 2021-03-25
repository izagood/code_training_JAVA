package test.problems;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import baekjoon_proj.problems.stepbystep.no1.HelloWorld_2557;
import baekjoon_proj.problems.stepbystep.no1.WeLoveKriii_10718;

public class Tests {
	@Test
	@DisplayName("기본 출력")
	void helloWorldTest() {
		HelloWorld_2557 helloWorld = new HelloWorld_2557();
		helloWorld.helloWorld();
	}
	
	@Test
	@DisplayName("기본 출력")
	void WeLoveKriiiTest() {
		WeLoveKriii_10718 weLoveKriii = new WeLoveKriii_10718();
		weLoveKriii.weLoveKriii();
	}
}
