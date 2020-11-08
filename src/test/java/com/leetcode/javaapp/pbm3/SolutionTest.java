package com.leetcode.javaapp.pbm3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {

    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @ParameterizedTest
    @CsvSource({ "3, abcabcbb", "1, bbbbb", "3, pwwkew", "0, ''", "3, dvdf" })
    void example(int output, String s) {
        int res = solution.lengthOfLongestSubstring(s);
        Assertions.assertEquals(output, res);
    }
}