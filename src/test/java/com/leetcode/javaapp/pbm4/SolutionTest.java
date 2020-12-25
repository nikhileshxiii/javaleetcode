package com.leetcode.javaapp.pbm4;

import lombok.extern.java.Log;
import org.junit.jupiter.api.*;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Collectors;

@Log
@DisplayNameGeneration(SolutionTest.CustomDisplayNameGenerator.class)
class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void findMedianSortedArrays_test1() {
        int[] arr1 = new int[]{1, 3};
        int[] arr2 = new int[]{2};
        double expected = 2.00000;
        Assertions.assertTrue(expected - solution.findMedianSortedArrays(arr1, arr2) < 0.01);
    }

    @Test
    void findMedianSortedArrays_test2() {
        int[] arr1 = new int[]{1, 2};
        int[] arr2 = new int[]{3, 4};
        double expected = 2.50000;
        Assertions.assertTrue(expected - solution.findMedianSortedArrays(arr1, arr2) < 0.01);
    }

    @Test
    void findMedianSortedArrays_test3() {
        int[] arr1 = new int[]{0, 0};
        int[] arr2 = new int[]{0, 0};
        double expected = 0.00000;
        Assertions.assertTrue(expected - solution.findMedianSortedArrays(arr1, arr2) < 0.01);
    }

    @Test
    void findMedianSortedArrays_test4() {
        int[] arr1 = new int[]{};
        int[] arr2 = new int[]{1};
        double expected = 1.00000;
        Assertions.assertTrue(expected - solution.findMedianSortedArrays(arr1, arr2) < 0.01);
    }

    @Test
    void findMedianSortedArrays_test5() {
        int[] arr1 = new int[]{2};
        int[] arr2 = new int[]{};
        double expected = 2.00000;
        Assertions.assertTrue(expected - solution.findMedianSortedArrays(arr1, arr2) < 0.01);
    }

    @Test
    void findMedianSortedArrays_test6() {
        int[] arr1 = new int[]{1, 2};
        int[] arr2 = new int[]{3, 4};
        double expected = 2.50000;
        Assertions.assertTrue(expected - solution.findMedianSortedArrays(arr1, arr2) < 0.01);
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