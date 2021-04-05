package test_project;


import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RegularExpressionTest {
	/**
	 * "ab."에서 "."은 문자 1개에 해당한다.
	 * "ab"는 "ab."와 일치하지 않는다.
	 * 이유는 "."에 해당하는 문자가 1개 없기 때문이다.
	 * "."은 문자, 숫자, 공백 상관없다.
	 */
	@Test
	@DisplayName(".패턴 예제")
	void example1() {
		String pattern = "ab.";
		Assert.assertFalse("ab".matches(pattern));
		Assert.assertTrue("abc".matches(pattern));
	}
}
