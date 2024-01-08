package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsPerfectSquare {
    @Test
    void Test1(){
        int num = 16;
        assertTrue(Searching.isPerfectSquare(num));
    }
    @Test
    void Test2(){
        int num = 14;
        assertFalse(Searching.isPerfectSquare(num));
    }
    @Test
    void Test3(){
        int num = 1;
        assertTrue(Searching.isPerfectSquare(num));
    }
    @Test
    void Test4(){
        int num = 2147483647;
        assertFalse(Searching.isPerfectSquare(num));
    }
    @Test
    void Test5(){
        int num = 808201;
        assertTrue(Searching.isPerfectSquare(num));
    }


}