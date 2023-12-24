package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RunningSumTest {

    @Test
    void Test1() {
        int[] input = {1,2,3,4};
        int[] ans = {1,3,6,10};
        assertArrayEquals(ans,LeetCode.runningSum(input));
        //assertArrayEquals(ans,LeetCode.runningSum2(input));
    }

    @Test
    void Test2() {
        int[] input = {3,1,2,10,1};
        int[] ans = {3,4,6,16,17};
        assertArrayEquals(ans,LeetCode.runningSum(input));
    }
    @Test
    void Test3() {
        int[] input = {1,1,1,1,1};
        int[] ans = {1,2,3,4,5};
        assertArrayEquals(ans,LeetCode.runningSum(input));
    }
}