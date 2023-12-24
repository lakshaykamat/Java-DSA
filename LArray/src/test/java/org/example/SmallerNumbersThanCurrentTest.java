package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallerNumbersThanCurrentTest {

    @Test
    void Test1() {
        assertArrayEquals(new int[]{4,0,1,1,3},LeetCode.smallerNumbersThanCurrent(new int[]{8,1,2,2,3}));
    }
    @Test
    void Test2() {
        assertArrayEquals(new int[]{2,1,0,3},LeetCode.smallerNumbersThanCurrent(new int[]{6,5,4,8}));
    }
    @Test
    void Test3(){
        assertArrayEquals(new int[]{0,0,0,0},LeetCode.smallerNumbersThanCurrent(new int[]{7,7,7,7}));
    }
}