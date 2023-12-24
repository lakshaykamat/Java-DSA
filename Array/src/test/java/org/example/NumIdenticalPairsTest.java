package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumIdenticalPairsTest {

    @Test
    void Test1() {
        assertEquals(4,LeetCode.numIdenticalPairs(new int[]{1,2,3,1,1,3}));
    }
    @Test
    void Test2(){
        assertEquals(6,LeetCode.numIdenticalPairs(new int[]{1,1,1,1}));
    }
}