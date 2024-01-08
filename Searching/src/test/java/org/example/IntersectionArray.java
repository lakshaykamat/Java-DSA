package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class IntersectionArray {
    @Test
    void Tes1() {
        int[] arr1 = {1, 2, 2, 1};
        int[] arr2 = {2, 2};
        int[] ans = {2};
        assertArrayEquals(ans, LeetCode.intersection(arr1, arr2));
    }

    @Test
    void Tes2() {
        int[] arr1 = {4, 9, 5};
        int[] arr2 = {9, 4, 9, 8, 4};
        int[] ans = {4, 9};
        assertArrayEquals(ans, LeetCode.intersection(arr1, arr2));
    }

}