package com.leetcode.javaapp.pbm1480;

public class Solution {
    public int[] runningSum(int[] nums) {
        int pre;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) pre = 0;
            else pre = nums[i-1];

            nums[i] = nums[i] + pre;

        }
        return nums;
    }
}
