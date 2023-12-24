package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuildArrayTest {

    @Test
    void Test1() {
        int[] ans = new int[]{0,1,2,4,5,3};
        int[] input = new int[]{0,2,1,5,3,4};
        assertArrayEquals(ans,LeetCode.buildArray(input));
    }
    @Test
    void Test2() {
        int[] ans = new int[]{4,5,0,1,2,3};
        int[] input = new int[]{5,0,1,2,3,4};
        assertArrayEquals(ans,LeetCode.buildArray(input));
    }
}