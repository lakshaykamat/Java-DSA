package org.example;

import java.util.Arrays;

public class LeetCode {

    public static int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] newArr = new int[length * 2];
        for (int i = 0; i < length; i++) {
            newArr[i] = nums[i];
            newArr[i + length] = nums[i];
        }
        return newArr;
    }

    public static int[] buildArray(int[] nums) {
        //https://leetcode.com/problems/build-array-from-permutation/
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    public static int[] runningSum(int[] nums) {
        //https://leetcode.com/problems/running-sum-of-1d-array/
        int[] ans = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }

    public static int[] runningSum2(int[] nums) {
        //https://leetcode.com/problems/running-sum-of-1d-array/
        int[] ans = new int[nums.length];
        if (nums.length == 0) {
            return ans;
        }
        ans[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ans[i] = nums[i] + ans[i - 1];
        }
        return ans;
    }

    public static int maximumWealth(int[][] accounts) {
        //https://leetcode.com/problems/richest-customer-wealth/
        int maxWeath = 0;
        for (int i = 0; i < accounts.length; i++) {
            int currentWealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                currentWealth += accounts[i][j];
            }
            maxWeath = Integer.max(maxWeath, currentWealth);
        }
        return maxWeath;
    }

    public static int[] shuffle(int[] nums,int n) {
        //TODO https://leetcode.com/problems/shuffle-the-array/
        //TODO Under progress
        int[] newArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {

        }
        return newArr;
    }

    public static int numIdenticalPairs(int[] nums) {
        //https://leetcode.com/problems/number-of-good-pairs/description/
        int countPair = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if ((nums[j] == nums[i]) && (i < j)) {
                    countPair++;
                }
            }
        }
        return countPair;
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        //https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) count++;
            }
            ans[i] = count;
        }
        return ans;
    }

    public static boolean checkIfPangram(String sentence) {
        //TODO Under progress
        return true;
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        //https://leetcode.com/problems/flipping-an-image/
        int[][] invertedArray = new int[image.length][image[0].length];

        //Flipping the array
        for(int i=0;i<image.length;i++){
            for(int j=image.length-1;j>=0;j--){
                /*
                    imageFlip[0][(3-1)- 2] = image[0][2]
                    imageFlip[0][(3-1)- 1] = image[0][1]
                    imageFlip[0][(3-1)- 0] = image[0][0]
                 */
               invertedArray[i][image.length-1 - j] = image[i][j];
            }
        }

        //Inverting the array
        for(int i=0;i<invertedArray.length;i++){
            for(int j=0;j<invertedArray.length;j++){
                if(invertedArray[i][j] == 1) invertedArray[i][j] = 0;
                else if(invertedArray[i][j] == 0) invertedArray[i][j] = 1;
            }
        }

        return invertedArray;
    }
    public static int[][] flipAndInvertImage2(int[][] image) {
        //https://leetcode.com/problems/flipping-an-image/
        int rows = image.length;
        int cols = image[0].length;
        int[][] invertedArray = new int[rows][cols];

        //Flipping the array
        for(int i=0;i<image.length;i++){
            for(int j=image.length-1;j>=0;j--){
                /*
                    imageFlip[0][(3-1)- 2] = image[0][2]
                    imageFlip[0][(3-1)- 1] = image[0][1]
                    imageFlip[0][(3-1)- 0] = image[0][0]
                 */
                invertedArray[i][image.length-1 - j] = (image[i][j] == 1) ? 0 : 1;
            }
        }

        return invertedArray;
    }
}
