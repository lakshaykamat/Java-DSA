package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetConcatenationTest {

    @Test
    void Test1() {
        assertArrayEquals(new int[]{1,2,1,1,2,1},LeetCode.getConcatenation(new int[]{1,2,1}));
    }
    @Test
    void Test2() {
        assertArrayEquals(new int[]{1,3,2,1,1,3,2,1},LeetCode.getConcatenation(new int[]{1,3,2,1}));
    }
}