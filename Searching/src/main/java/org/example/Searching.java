package org.example;

public class Searching {
    static int searchIndex(int[] nums, int target) {
        //Search Index in an array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return i;
        }
        return -1;
    }

    static int[] searchIndex(int[][] nums, int target) {
        //Search target in 2D array
        for (int rows = 0; rows < nums.length; rows++) {
            for (int cols = 0; cols < nums[rows].length; cols++) {
                if (nums[rows][cols] == target) {
                    return new int[]{rows, cols};
                }
            }
        }
        return new int[]{-1, -1};
    }
    static int searchIndex(int[] arr,int startIndex,int endIndex,int target){
        //Search target in given index
        for(int i=startIndex;i<endIndex;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    static int searchIndex(String str, char ch){
        //Search index a given string
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                return i;
            }
        }
        return -1;
    }

    static boolean isContain(int[] nums, int target) {
        for (int num : nums) {
            if (num == target) return true;
        }
        return false;
    }

    //Find minimum number in an array
    static int findMin(int[] arr){
        if(arr.length == 0) return -1;
        int min = arr[0];
        for (int index : arr) {
            if(index < min){
                min = index;
            }
        }
        return min;
    }
    //Find minimum number in an array
    static int findMax(int[][] nums){
        //Search target in 2D array
        int max = 0;
        for (int[] num : nums) {
            for (int i : num) {
                if (i > max) {
                    max = i;
                }
            }
        }
        return max;
    }
    static int findMax(int[] arr){
        if(arr.length == 0) return -1;
        int max = arr[0];
        for (int index : arr) {
            if(index > max){
                max = index;
            }
        }
        return max;
    }
    static int[] findMinAndMax(int[] arr){
        return new int[]{findMin(arr),findMax(arr)};
    }
    static int[] findMinAndMaxIndex(int[] arr){
        int min = findMin(arr);
        int max = findMax(arr);
        return new int[]{searchIndex(arr,min),searchIndex(arr,max)};
    }
}
