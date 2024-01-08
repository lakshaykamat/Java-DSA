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

    //Binary Search on an array
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            //int mid = (start/2) + (end/2);
            int mid = start + (end - start) / 2; //Find mid element

            if (arr[mid] == target) return mid; //Middle element is equal to target element

            //The Middle element is greater than the target hence target value lies on left side of an array
            if (arr[mid] > target) end = mid - 1;
                //The Middle element is less than the target hence target value lies on right side of an array
            else start = mid + 1;
        }
        //element not found
        return -1;
    }
    static int binarySearch(int[] arr, int target,int start,int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2; //Find mid element

            if (arr[mid] == target) return mid; //Middle element is equal to target element

            //The Middle element is greater than the target hence target value lies on left side of an array
            if (arr[mid] > target) end = mid - 1;
                //The Middle element is less than the target hence target value lies on right side of an array
            else start = mid + 1;
        }
        //element not found
        return -1;
    }

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        if(arr.length == 0) return -1;

        boolean isAscending = Array.isAscendingOrder(arr);
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) return mid;
            if (isAscending) {
                if (arr[mid] > target) end = mid - 1;
                else start = mid + 1;
            } else {
                if (arr[mid] > target) start = mid + 1;
                else end = mid - 1;
            }
        }
        return -1;
    }

    //Ceiling of a number
    static int ceilingOfNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) return mid;

            if (arr[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return start;
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // you are in dec part of an array
                // this may be the ans, but look at a left
                // this is why end != mid - 1
                end = mid;
            } else {
                // you are in asc part of array
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }
        return start;
    }

    static boolean isPerfectSquare(int num) {
        int start = 0, end = num;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid == num) return true;
            long sq = (long) mid *mid;

            if(sq > num){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return false;
    }
    static int countNegatives(int[][] grid) {
        int count = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j] < 0) count++;
            }
        }
        return count;
    }
    static int[] findMinAndMaxIndex(int[] arr){
        int min = findMin(arr);
        int max = findMax(arr);
        return new int[]{searchIndex(arr,min),searchIndex(arr,max)};
    }
}
