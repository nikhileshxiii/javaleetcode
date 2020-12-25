package com.leetcode.javaapp.pbm1;

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
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] output = new int[]{0, 1};
        int[] res = solution.twoSum(nums, target);
        Assertions.assertArrayEquals(output, res);
    }

    @Test
    void example2() {
        int[] nums = new int[]{3, 2, 4};
        int target = 6;
        int[] output = new int[]{1, 2};
        int[] res = solution.twoSum(nums, target);
        Assertions.assertArrayEquals(output, res);
    }

    @Test
    void example3() {
        int[] nums = new int[]{3, 3};
        int target = 6;
        int[] output = new int[]{0, 1};
        int[] res = solution.twoSum(nums, target);
        Assertions.assertArrayEquals(output, res);
    }

    @Test
    void example4() {
        int[] nums = new int[]{3, 2, 4};
        int target = 9;
        int[] output = null;
        int[] res = solution.twoSum(nums, target);
        Assertions.assertArrayEquals(output, res);
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