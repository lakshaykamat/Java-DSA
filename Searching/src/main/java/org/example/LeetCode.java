package org.example;

import java.util.ArrayList;

import static org.example.Array.convertListToArray;

public class LeetCode {
    static int[] intersection(int[] nums1, int[] nums2) {
        //Link https://leetcode.com/problems/intersection-of-two-arrays/
        ArrayList<Integer> ans = new ArrayList<>();
        for (int j : nums1) {
            if (ans.contains(j)) continue;
            for (int k : nums2) {
                if (j == k) {
                    ans.add(j);
                    break;
                }
            }
        }
        return convertListToArray(ans);
    }
}
