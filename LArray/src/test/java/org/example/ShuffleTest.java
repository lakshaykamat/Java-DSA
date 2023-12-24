package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShuffleTest {

    @Test
    void Test1() {
        assertArrayEquals(new int[]{2,3,5,4,1,7},LeetCode.shuffle(new int[]{2,5,1,3,4,7},3));
    }
    @Test
    void Test2(){
        assertArrayEquals(new int[]{1,4,2,3,3,2,4,1},LeetCode.shuffle(new int[]{1,2,3,4,4,3,2,1},4));
    }
    @Test
    void Test3(){
        assertArrayEquals(new int[]{1,2,1,2},LeetCode.shuffle(new int[]{1,1,2,2},2));
    }
}