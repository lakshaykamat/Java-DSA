package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumWealthTest {

    @Test
    void Test1() {
        int[][] input = {
                {1,2,3},
                {3,2,1}
        };
        int ans = 6;
        assertEquals(ans,LeetCode.maximumWealth(input));
    }
    @Test
    void Test2() {
        int[][] input = {
                {1,5},
                {7,3},
                {3,5}
        };
        int ans = 10;
        assertEquals(ans,LeetCode.maximumWealth(input));
    }
    @Test
    void Test3() {
        int[][] input = {
                {2,8,7},
                {7,1,3},
                {1,9,5}
        };
        int ans = 17;
        assertEquals(ans,LeetCode.maximumWealth(input));
    }
}