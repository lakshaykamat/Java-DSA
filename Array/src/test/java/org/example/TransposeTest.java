package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransposeTest {
    @Test
    void Test1(){
        int[][] ans = {
                {1,4,7},
                {2,5,8},
                {3,6,9}
        };
        int[][] input = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        assertArrayEquals(ans,LeetCode.transpose(input));
    }

    @Test
    void Test2(){
        int[][] ans = {
                {1,4},
                {2,5},
                {3,6}
        };
        int[][] input = {
                {1,2,3},
                {4,5,6},
        };
        assertArrayEquals(ans,LeetCode.transpose(input));
    }
    @Test
    void Test3(){
        int[][] ans = {
                {3},
                {7},
                {8}
        };
        int[][] input = {
                {3,7,8},
        };
        assertArrayEquals(ans,LeetCode.transpose(input));
    }
}