package com.leetcode.javaapp.pbm3;

import org.junit.jupiter.api.*;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Collectors;

@DisplayNameGeneration(SolutionTest.CustomDisplayNameGenerator.class)
class SolutionTest {

    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void example1() {
        String s = "abcabcbb";
        int output = 3;

        int res = solution.lengthOfLongestSubstring(s);
        Assertions.assertEquals(output, res);
    }

    @Test
    void example2() {
        String s = "bbbbb";
        int output = 1;

        int res = solution.lengthOfLongestSubstring(s);
        Assertions.assertEquals(output, res);
    }

    @Test
    void example3() {
        String s = "pwwkew";
        int output = 3;

        int res = solution.lengthOfLongestSubstring(s);
        Assertions.assertEquals(output, res);
    }

    @Test
    void example4() {
        String s = "";
        int output = 0;

        int res = solution.lengthOfLongestSubstring(s);
        Assertions.assertEquals(output, res);
    }

    @Test
    void example5() {
        String s = "dvdf";
        int output = 3;

        int res = solution.lengthOfLongestSubstring(s);
        Assertions.assertEquals(output, res);
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