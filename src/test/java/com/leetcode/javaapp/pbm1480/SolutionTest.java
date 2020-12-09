package com.leetcode.javaapp.pbm1480;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

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
    void runningSum1() {
        int[] nums = new int[]{1, 2, 3, 4};
        int[] output = new int[]{1, 3, 6, 10};
    }

    @Test
    void runningSum2() {
        int[] nums = new int[]{1, 1, 1, 1, 1};
        int[] output = new int[]{1, 2, 3, 4, 5};
    }

    @Test
    void runningSum3() {
        int[] nums = new int[]{3, 1, 2, 10, 1};
        int[] output = new int[]{3, 4, 6, 16, 17};
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