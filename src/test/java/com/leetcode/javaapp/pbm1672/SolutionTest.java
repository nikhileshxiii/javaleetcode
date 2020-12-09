package com.leetcode.javaapp.pbm1672;

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
    void maximumWealth1() {
        int[][] accounts = new int[][]{{1, 2, 3}, {3, 2, 1}};
        Integer output = 6;
        Integer result = solution.maximumWealth(accounts);
        Assertions.assertEquals(output, result);
    }

    @Test
    void maximumWealth2() {
        int[][] accounts = new int[][]{{1, 5}, {7, 3}, {3, 5}};
        Integer output = 10;
        Integer result = solution.maximumWealth(accounts);
        Assertions.assertEquals(output, result);
    }

    @Test
    void maximumWealth3() {
        int[][] accounts = new int[][]{{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        Integer output = 17;
        Integer result = solution.maximumWealth(accounts);
        Assertions.assertEquals(output, result);
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