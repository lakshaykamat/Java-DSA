package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchInRoatedArray {
    @Test
    void Test1() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int ans = 4, target = 0;
        assertEquals(ans, Searching.searchInRotatedArray(nums, target));
    }

    @Test
    void Test2() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int ans = -1, target = 3;
        assertEquals(ans, Searching.searchInRotatedArray(nums, target));
    }

    @Test
    void Test3() {
        int[] nums = {1};
        int ans = -1, target = 0;
        assertEquals(ans, Searching.searchInRotatedArray(nums, target));
    }

    @Test
    void Test4() {
        int[] nums = {1,3};
        int ans = 0, target = 1;
        assertEquals(ans, Searching.searchInRotatedArray(nums, target));
    }

}