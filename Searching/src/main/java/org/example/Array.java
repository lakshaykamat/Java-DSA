package org.example;

import java.util.ArrayList;

public class Array {
    static boolean isAscendingOrder(int[] arr) {
        return arr[0] <= arr[arr.length - 1];
    }

    //Find minimum number in an array
    static int findMin(int[] arr) {
        if (arr.length == 0) return -1;
        int min = Integer.MAX_VALUE;
        for (int index : arr) {
            if (index < min) {
                min = index;
            }
        }
        return min;
    }

    static int findMax(int[] arr) {
        if (arr.length == 0) return -1;
        int max = arr[0];
        for (int index : arr) {
            if (index > max) {
                max = index;
            }
        }
        return max;
    }

    static int findMaxIndex(int[] arr) {
        int max = findMax(arr);
        return Searching.binarySearch(arr, max);
    }

    static boolean isContain(int[] nums, int target) {
        for (int num : nums) {
            if (num == target) return true;
        }
        return false;
    }

    //Find maximum number in a two-dimensional array
    static int findMax(int[][] nums) {
        //Search target in 2D array
        int max = Integer.MIN_VALUE;
        for (int[] num : nums) {
            for (int i : num) {
                if (i > max) {
                    max = i;
                }
            }
        }
        return max;
    }

    static int[] findMinAndMax(int[] arr) {
        return new int[]{findMin(arr), findMax(arr)};
    }

    static int[] findMinAndMaxIndex(int[] arr) {
        int min = findMin(arr);
        int max = findMax(arr);
        return new int[]{Searching.searchIndex(arr, min), Searching.searchIndex(arr, max)};
    }

    public static int[] convertListToArray(ArrayList<Integer> arrayList) {
        int[] intArray = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            intArray[i] = arrayList.get(i);
        }
        return intArray;
    }
}
