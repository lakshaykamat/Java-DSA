package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class isArrayContain {

    @Test
    void Test1() {
        assertTrue(Array.isContain(new int[]{1, 2, 3, 4, 5}, 5));
    }

    @Test
    void Test2() {
        assertFalse(Array.isContain(new int[]{1, 2, 3, 4, 5}, 50));
    }
}