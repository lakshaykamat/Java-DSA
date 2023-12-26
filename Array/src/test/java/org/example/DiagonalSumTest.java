package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiagonalSumTest {

    @Test
    void Test1() {
        int ans = 25;
        int[][] input = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        assertEquals(ans,LeetCode.diagonalSum(input));
    }
    @Test
    void Test2() {
        int ans = 8;
        int[][] input = {
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1}
        };
        assertEquals(ans,LeetCode.diagonalSum(input));
    }
    @Test
    void Test3(){
        int ans = 5;
        int[][] input = {
                {5}
        };
        assertEquals(ans,LeetCode.diagonalSum(input));
    }
}