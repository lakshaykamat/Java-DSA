package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlipAndInvertTest {

    @Test
    void Test1() {
        int[][] input = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        int[][] ans = {
                {1,0,0},
                {0,1,0},
                {1,1,1}
        };
        assertArrayEquals(ans,LeetCode.flipAndInvertImage(input));
        assertArrayEquals(ans,LeetCode.flipAndInvertImage2(input));
    }
    @Test
    void Test2() {
        int[][] input = {
                {1,1,0,0},
                {1,0,0,1},
                {0,1,1,1},
                {1,0,1,0}
        };
        int[][] ans = {
                {1,1,0,0},
                {0,1,1,0},
                {0,0,0,1},
                {1,0,1,0}
        };
        assertArrayEquals(ans,LeetCode.flipAndInvertImage(input));
        assertArrayEquals(ans,LeetCode.flipAndInvertImage2(input));
    }
}