package com.leetcode.javaapp.pbm1678;

public class Solution {
    public String interpret(String command) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                stringBuilder.append("G");
            } else if (command.charAt(i) == ')' && ("" + command.charAt(i - 1) + command.charAt(i)).equals("()")) {
                stringBuilder.append("o");
            } else if ((command.charAt(i)) == ')' && ("" + command.charAt(i - 3) + command.charAt(i - 2) + command.charAt(i - 1) + command.charAt(i)).equals("(al)")) {
                stringBuilder.append("al");
            }
        }
        return stringBuilder.toString();
    }
}
