package org.example;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int max = Array.maximumValueIndex(candies);
        for (int candy : candies) {
            if (candy + extraCandies >= candies[max]) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }
        return ans;
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
    public static int largestAltitude(int[] gain) {
        // TODO https://leetcode.com/problems/find-the-highest-altitude/
        int currentMax = 0;
        int max = 0;
        for (int j : gain) {
            currentMax += j;
            max = Math.max(max, currentMax);
        }
        return max;
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

    public static int diagonalSum(int[][] mat) {
        // Initialize variables to store diagonal sums and matrix size
        int primaryDiagonal = 0;
        int row = mat.length;

        // Handling the case where the matrix has only one element
        // Return the single element as the diagonal sum
        if (row == 1) return mat[0][0];


        // Calculate the sum of elements on the primary diagonal
        for (int i = 0; i < row; i++) {
            // Adding elements where row index equals column index (primary diagonal)
            primaryDiagonal += mat[i][i];
        }


        int secondaryDiagonal = 0;
        // Calculate the sum of elements on the secondary diagonal
        for (int i = 0; i < row; i++) {
            // Adding elements where the sum of row and column indices equals 'matrix.length - 1' (secondary diagonal)
            secondaryDiagonal += mat[i][row - i - 1];
        }

        int middleElement = 0;
        // Calculate the middle element if the matrix size is odd
        if ((row - 1) % 2 == 0) {
            // Retrieve the middle element's value located at indices (matrix.length - 1) / 2
            middleElement = mat[(row - 1) / 2][(row - 1) / 2];
        }

        return primaryDiagonal + secondaryDiagonal - middleElement;
    }

     static int findNumbers(int[] nums) {
        //Link: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

         // Initialize a count to keep track of numbers with an even number of digits
        int count = 0;
        for(int item:nums){
            int digit = 0; //Initialize 'digit' to count the number of digits in 'item'

            /*
            1st Approach: Counting the number of digits with converting to a string uses more memory
            String str = Integer.toString(item);
            digit = str.length();
            */

            //2nd Approach: Counting the number of digits without converting to a string
            if(item == 0){
                digit = 1; // Special case: If 'item' is 0, it has 1 digit
            }else{
                // Loop to count the number of digits using division by 10 until 'item' becomes 0
                while(item !=0 ){
                    item = item / 10; //Remove the last digit of 'item'
                    digit++; // Increment the count of digits
                }
            }

            // Check if the count of digits in 'item' is even
            // Increment 'count' if 'item' has an even number of digits
            if(digit %2 ==0)count++;

        }
        return count;
    }
    public static int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] ans;
        if(row == col){
            ans = new int[row][col];
            for(int i = 0; i<row; i++){
                for(int j = 0; j<row;j++){
                    ans[j][i] = matrix[i][j];
                }
            }
        }else{
            ans = new int[col][row];
            System.out.println(Arrays.deepToString(matrix));
            for(int i = 0; i<row; i++){
                for(int j = 0; j<col;j++){
                    ans[j][i] = matrix[i][j];
                }
            }
        }
        return ans;
    }
    static int[][] transpose2(int[][] matrix){
        //Link: https://leetcode.com/problems/transpose-matrix/

        // Get the number of columns and rows in the input matrix
        int cols = matrix[0].length;
        int rows = matrix.length;

        //Create matrix with swapped dimensions (columns and rows)
        int[][] newMatrix = new int[cols][rows];

        // Iterate through the original matrix to perform the transpose operation
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                // Assign the value from the original matrix to the transposed matrix
                // Swaps rows and columns to transpose the matrix
                 newMatrix[j][i] = matrix[i][j];
            }
        }
        return newMatrix;
    }
                }
            }
}
