package com.leetcode.javaapp.pbm7;

import org.junit.jupiter.api.*;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Collectors;

@DisplayNameGeneration(SolutionTest.CustomDisplayNameGenerator.class)
class SolutionTest {

	private Solution solution;

	@BeforeEach
	void setUp() {
		solution = new Solution();
	}

	@Test
	void reverse_test1() {
		int x = 123;
		int Output = 321;
		Assertions.assertEquals(Output, solution.reverse(x));
	}

	@Test
	void reverse_test2() {
		int x = -123;
		int Output = -321;
		Assertions.assertEquals(Output, solution.reverse(x));
	}

	@Test
	void reverse_test3() {
		int x = 120;
		int Output = 21;
		Assertions.assertEquals(Output, solution.reverse(x));
	}

	@Test
	void reverse_test4() {
		int x = 0;
		int Output = 0;
		Assertions.assertEquals(Output, solution.reverse(x));
	}

	@Test
	void reverse_test5() {
		int x = 1534236469;
		int Output = 0;
		Assertions.assertEquals(Output, solution.reverse(x));
	}

	static class CustomDisplayNameGenerator extends DisplayNameGenerator.Standard {

		@Override
		public String generateDisplayNameForClass(Class<?> testClass) {
			return this.getClass().getPackageName();
		}

		@Override
		public String generateDisplayNameForNestedClass(Class<?> nestedClass) {
			return super.generateDisplayNameForNestedClass(nestedClass);
		}

		@Override
		public String generateDisplayNameForMethod(Class<?> testClass, Method testMethod) {
			String name = testMethod.getName();
			return Arrays.stream(name.split("_")).collect(Collectors.joining(" | "));
		}
	}
}
