package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ceilingOfNumber {
    @Test
    void Test1(){
        int[] input = {1,5,10,12,17,28,43,250};
        int target = 20;
        assertEquals(5,Searching.ceilingOfNumber(input,target));
    }

}