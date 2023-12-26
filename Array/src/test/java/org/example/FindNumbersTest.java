package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindNumbersTest {

    @Test
    void Test1() {
        int ans = 2;
        int[] input = {12,345,2,6,7896};
        assertEquals(ans,LeetCode.findNumbers(input));
    }
    @Test
    void Test2() {
        int ans = 1;
        int[] input = {555,901,482,1771};
        assertEquals(ans,LeetCode.findNumbers(input));
    }
}