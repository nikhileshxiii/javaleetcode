package com.leetcode.javaapp.pbm4;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;

        int x = nums1.length;
        int y = nums2.length;

        int midPoint = (x + y) / 2;
        List<Integer> finalList = new ArrayList<>();

        while (i < x && j < y) {

            if (nums1[i] < nums2[j])
                finalList.add(nums1[i++]);

            else if (nums2[j] < nums1[i])
                finalList.add(nums2[j++]);

            else {
                finalList.add(nums1[i++]);
                finalList.add(nums2[j++]);
            }

        }

        while (i < x)
            finalList.add(nums1[i++]);

        while (j < y)
            finalList.add(nums2[j++]);

        if ((x + y) % 2 == 1)
            return finalList.get(midPoint);
        else
            return ((double) (finalList.get(midPoint - 1) + finalList.get(midPoint))) / 2;
    }
}