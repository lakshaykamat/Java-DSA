package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckIfPanagramTest {
    @Test
    void Test1() {
        assertTrue(LeetCode.checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }
    @Test
    void Test2() {
        assertFalse(LeetCode.checkIfPangram("leetcode"));
    }
}
