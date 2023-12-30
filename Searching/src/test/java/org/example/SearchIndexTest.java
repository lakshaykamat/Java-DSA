package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchIndexTest {

    @Test
    void Test1() {
        assertEquals(-1,Searching.searchIndex(new int[]{1,2,3},4));
    }
    @Test
    void Test2() {
        assertEquals(1,Searching.searchIndex(new int[]{1,2,3},2));
    }

}