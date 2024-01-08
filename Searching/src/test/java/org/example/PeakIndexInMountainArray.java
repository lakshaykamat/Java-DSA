package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PeakIndexInMountainArray {
    @Test
    void Test1(){
        int[] input = {0,1,0};
        int ans = 1;
        assertEquals(ans,Searching.peakIndexInMountainArray(input));
    }
    @Test
    void Test2(){
        int[] input = {0,2,1,0};
        int ans = 1;
        assertEquals(ans,Searching.peakIndexInMountainArray(input));
    }
    @Test
    void Test3(){
        int[] input = {0,10,5,2};
        int ans = 1;
        assertEquals(ans,Searching.peakIndexInMountainArray(input));
    }

}