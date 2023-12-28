package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargetAltitudeTest {

    @Test
    void Test1() {
        int[] input = {-5,1,5,0,-7};
        int ans = 1;
        assertEquals(ans,LeetCode.largestAltitude(input));
    }
    @Test
    void Test2() {
        int[] input = {-4,-3,-2,-1,4,3,2};
        int ans = 0;
        assertEquals(ans,LeetCode.largestAltitude(input));
    }
}