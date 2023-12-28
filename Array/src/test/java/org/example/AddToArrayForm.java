package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AddToArrayForm {
    @Test
    public void Test1() {
        List<Integer> ans = List.of(1, 2, 3, 4);
        int[] input = new int[]{1, 2, 0, 0};
        int k = 34;

        // Call the method to get the result as a List<Integer>
        List<Integer> result = LeetCode.addToArrayForm(input, k);

        // Convert List<Integer> to Integer[] for comparison
        Integer[] expectedResultArray = ans.toArray(new Integer[0]);
        Integer[] resultArray = result.toArray(new Integer[0]);

        // Convert Integer[] to int[] for comparison
        int[] expectedIntArray = Arrays.stream(expectedResultArray).mapToInt(Integer::intValue).toArray();
        int[] resultIntArray = Arrays.stream(resultArray).mapToInt(Integer::intValue).toArray();

        // Assert the equality between the expected and actual int arrays
        assertArrayEquals(expectedIntArray, resultIntArray);
    }


}