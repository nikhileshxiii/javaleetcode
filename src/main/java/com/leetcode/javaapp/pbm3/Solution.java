package com.leetcode.javaapp.pbm3;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longestStringLength = 0;
        int start = 0;
        int end = 0;
        Set<Character> set = new HashSet<>();

        while (end < s.length()) {
            char charConsidered = s.charAt(end);
            if (set.contains(charConsidered)) {
                set.remove(s.charAt(start));
                start++;
            } else {
                set.add(charConsidered);
                longestStringLength = Math.max(longestStringLength, set.size());
                end++;
            }
        }
        return longestStringLength;
    }
}