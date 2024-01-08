package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    @Test
    void Test1(){
        int[] arr = {2,4,6,9,11,12,14,20,36,48};
        int target = 11;
        assertEquals(4, Searching.binarySearch(arr,target));
    }
    @Test
    void Test2(){
        int[] arr = {2,4,6,9,11,12,14,20,36,48};
        int target = 20;
        assertEquals(7, Searching.binarySearch(arr,target));
    }
    @Test
    void Test3(){
        int[] arr = {2,4,6,9,11,12,14,20,36,48};
        int target = 2;
        assertEquals(0, Searching.binarySearch(arr,target));
    }
    @Test
    void Test4(){
        int[] arr = {2,4,6,9,11,12,14,20,36,48};
        int target = 21;
        assertEquals(-1, Searching.binarySearch(arr,target));
    }
    @Test
    void Test5(){
        int[] arr = {2,4,6,9,11,12,14,20,36,48};
        int target = 11;
        assertEquals(4, Searching.orderAgnosticBinarySearch(arr,target));
    }
    @Test
    void Test6(){
        int[] arr = {48,36,20,14,12,11,9,6,4,2};
        int target = 21;
        assertEquals(-1, Searching.orderAgnosticBinarySearch(arr,target));
    }
    @Test
    void Test7(){
        int[] arr = {48,36,20,14,12,11,9,6,4,2};
        int target = 48;
        assertEquals(0, Searching.orderAgnosticBinarySearch(arr,target));
    }

}