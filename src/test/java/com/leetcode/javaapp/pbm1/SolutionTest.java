package com.leetcode.javaapp.pbm1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

}