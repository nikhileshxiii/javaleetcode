package com.leetcode.javaapp.pbm1672;

public class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sumOfAccounts = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sumOfAccounts += accounts[i][j];
            }
            max = Math.max(max, sumOfAccounts);
        }
        return max;
    }
}