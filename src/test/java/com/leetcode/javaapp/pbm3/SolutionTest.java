package com.leetcode.javaapp.pbm3;

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

}