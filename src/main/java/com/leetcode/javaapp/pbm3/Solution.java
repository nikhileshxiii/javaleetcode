package com.leetcode.javaapp.pbm3;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) return 0;
        Map<Character, Integer> map = new HashMap<>();
        int startIndex = 0;
        int endIndex = 0;
        int longestStringStartIndex = 0;
        int longestStringEndIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                startIndex = i;
            } else {
                map.put(ch, i);
                endIndex = i;
                if (endIndex - startIndex > longestStringEndIndex - longestStringStartIndex) {
                    longestStringStartIndex = startIndex;
                    longestStringEndIndex = endIndex;
                }
            }
        }
        return s.substring(longestStringStartIndex, longestStringEndIndex + 1).length();
    }
}