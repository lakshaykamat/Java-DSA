package org.example;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class LeetCode {

    static int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] newArr = new int[length * 2];
        for (int i = 0; i < length; i++) {
            newArr[i] = nums[i];
            newArr[i + length] = nums[i];
        }
        return newArr;
    }

    static int[] buildArray(int[] nums) {
        // https://leetcode.com/problems/build-array-from-permutation/
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    static int[] runningSum(int[] nums) {
        // https://leetcode.com/problems/running-sum-of-1d-array/
        int[] ans = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }

    static int[] runningSum2(int[] nums) {
        // https://leetcode.com/problems/running-sum-of-1d-array/
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

    static int maximumWealth(int[][] accounts) {
        // https://leetcode.com/problems/richest-customer-wealth/
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

    static int[] shuffle(int[] nums, int n) {
        //TODO review Link: https://leetcode.com/problems/shuffle-the-array/
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[i + n];
        }
        return ans;
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
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

    static int numIdenticalPairs(int[] nums) {
        // https://leetcode.com/problems/number-of-good-pairs/description/
        int countPair = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[j] == nums[i]) && (i < j)) {
                    countPair++;
                }
            }
        }
        return countPair;
    }

    static int[] smallerNumbersThanCurrent(int[] nums) {
        // https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j])
                    count++;
            }
            ans[i] = count;
        }
        return ans;
    }

    static boolean checkIfPangram(String sentence) {
        // https://leetcode.com/problems/check-if-the-sentence-is-pangram/
        boolean[] arr = new boolean[26];
        for (int i = 0; i < sentence.length(); i++) {
            arr[sentence.charAt(i) - 'a'] = true;
            System.out.println(arr[i]);
        }
        for (int i = 0; i < 26; i++) {
            if (!arr[i]) {
                return false;
            }
        }
        return true;
    }

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        //https://leetcode.com/problems/count-items-matching-a-rule/
        int ans = 0;
        for (int i = 0; i < items.size(); i++) {
            if (ruleKey.equals("color")) {
                if (ruleValue.equals(items.get(i).get(1)))
                    ans++;
            } else if (ruleKey.equals("type")) {
                if (ruleValue.equals(items.get(i).get(0)))
                    ans++;
            } else {
                if (ruleValue.equals(items.get(i).get(2)))
                    ans++;
            }
        }

        return ans;
    }

    static int largestAltitude(int[] gain) {
        // TODO https://leetcode.com/problems/find-the-highest-altitude/
        int currentMax = 0;
        int max = 0;
        for (int j : gain) {
            currentMax += j;
            max = Math.max(max, currentMax);
        }
        return max;
    }

    static int[][] flipAndInvertImage(int[][] image) {
        // https://leetcode.com/problems/flipping-an-image/
        int[][] invertedArray = new int[image.length][image[0].length];

        // Flipping the array
        for (int i = 0; i < image.length; i++) {
            for (int j = image.length - 1; j >= 0; j--) {
                /*
                 * imageFlip[0][(3-1)- 2] = image[0][2]
                 * imageFlip[0][(3-1)- 1] = image[0][1]
                 * imageFlip[0][(3-1)- 0] = image[0][0]
                 */
                invertedArray[i][image.length - 1 - j] = image[i][j];
            }
        }

        // Inverting the array
        for (int i = 0; i < invertedArray.length; i++) {
            for (int j = 0; j < invertedArray.length; j++) {
                if (invertedArray[i][j] == 1)
                    invertedArray[i][j] = 0;
                else if (invertedArray[i][j] == 0)
                    invertedArray[i][j] = 1;
            }
        }

        return invertedArray;
    }

    static int[][] flipAndInvertImage2(int[][] image) {
        // https://leetcode.com/problems/flipping-an-image/
        int rows = image.length;
        int cols = image[0].length;
        int[][] invertedArray = new int[rows][cols];

        // Flipping the array
        for (int i = 0; i < image.length; i++) {
            for (int j = image.length - 1; j >= 0; j--) {
                /*
                 * imageFlip[0][(3-1)- 2] = image[0][2]
                 * imageFlip[0][(3-1)- 1] = image[0][1]
                 * imageFlip[0][(3-1)- 0] = image[0][0]
                 */
                invertedArray[i][image.length - 1 - j] = (image[i][j] == 1) ? 0 : 1;
            }
        }

        return invertedArray;
    }

    static int diagonalSum(int[][] mat) {
        // Initialize variables to store diagonal sums and matrix size
        int primaryDiagonal = 0;
        int row = mat.length;

        // Handling the case where the matrix has only one element
        // Return the single element as the diagonal sum
        if (row == 1)
            return mat[0][0];

        // Calculate the sum of elements on the primary diagonal
        for (int i = 0; i < row; i++) {
            // Adding elements where row index equals column index (primary diagonal)
            primaryDiagonal += mat[i][i];
        }

        int secondaryDiagonal = 0;
        // Calculate the sum of elements on the secondary diagonal
        for (int i = 0; i < row; i++) {
            // Adding elements where the sum of row and column indices equals 'matrix.length
            // - 1' (secondary diagonal)
            secondaryDiagonal += mat[i][row - i - 1];
        }

        int middleElement = 0;
        // Calculate the middle element if the matrix size is odd
        if ((row - 1) % 2 == 0) {
            // Retrieve the middle element's value located at indices (matrix.length - 1) /
            // 2
            middleElement = mat[(row - 1) / 2][(row - 1) / 2];
        }

        return primaryDiagonal + secondaryDiagonal - middleElement;
    }

    static int findNumbers(int[] nums) {
        // Link: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

        // Initialize a count to keep track of numbers with an even number of digits
        int count = 0;
        for (int item : nums) {
            int digit = 0; // Initialize 'digit' to count the number of digits in 'item'

            /*
             * 1st Approach: Counting the number of digits with converting to a string uses
             * more memory
             * String str = Integer.toString(item);
             * digit = str.length();
             */

            // 2nd Approach: Counting the number of digits without converting to a string
            if (item == 0) {
                digit = 1; // Special case: If 'item' is 0, it has 1 digit
            } else {
                // Loop to count the number of digits using division by 10 until 'item' becomes
                // 0
                while (item != 0) {
                    item = item / 10; // Remove the last digit of 'item'
                    digit++; // Increment the count of digits
                }
            }

            // Check if the count of digits in 'item' is even
            // Increment 'count' if 'item' has an even number of digits
            if (digit % 2 == 0)
                count++;

        }
        return count;
    }

    static int[][] transpose(int[][] matrix) {
        // Link: https://leetcode.com/problems/transpose-matrix/

        // Get the number of columns and rows in the input matrix
        int cols = matrix[0].length;
        int rows = matrix.length;

        // Create matrix with swapped dimensions (columns and rows)
        int[][] newMatrix = new int[cols][rows];

        // Iterate through the original matrix to perform the transpose operation
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                // Assign the value from the original matrix to the transposed matrix
                // Swaps rows and columns to transpose the matrix
                newMatrix[i][j] = matrix[j][i];
            }
        }
        return newMatrix;
    }

    static List<Integer> addToArrayForm(int[] num, int k) {
        //Link: https://leetcode.com/problems/add-to-array-form-of-integer

        // Convert the integer array 'num' into a string representation
        StringBuilder numAsString = new StringBuilder();
        for (int digit : num) {
            numAsString.append(digit);
        }

        // Convert the string representation to a BigInteger
        BigInteger bigNum = new BigInteger(numAsString.toString());

        // Convert 'k' to a BigInteger
        BigInteger bigK = BigInteger.valueOf(k);

        // Add 'bigK' to 'bigNum' to get the sum
        BigInteger sum = bigNum.add(bigK);

        // Convert the sum back to a string and then to a List<Integer>
        return bigIntegerToIntegerList(sum);
    }

    static List<Integer> bigIntegerToIntegerList(BigInteger number) {
        List<Integer> resultList = new ArrayList<>();

        // Convert the BigInteger to a string
        String numStr = number.toString();

        // Add each character (digit) from the string to the resultList as integers
        for (char c : numStr.toCharArray()) {
            int digit = Character.getNumericValue(c);
            resultList.add(digit);
        }

        return resultList;
    }

    static int[] twoSum(int[] nums, int target) {
        //TODO Write test
        int[] ans = new int[0];
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j)
                    continue;
                if (nums[i] + nums[j] == target)
                    return new int[]{j, i};
            }
        }
        return ans;
    }

    static boolean findRotation(int[][] mat, int[][] target) {
        //TODO: Write Test
        for (int i = 0; i < 4; i++) {
            if (Array.isMatrixEqual(mat, target)) {
                return true;
            }
            Array.rotateMatrixClockwise(mat);
        }
        return false;
    }

    public static int[] sumZero(int n) {
        //TODO Link: https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
        return new int[]{};
    }
    static int oddCells(int m, int n, int[][] indices) {
        //TODO Write testLink: https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
        int[][] mat = new int[m][n];
        for (int[] index : indices) {
            Array.incrementRow(mat, index[0], 1);
            Array.incrementCol(mat, index[1], 1);
        }
        return Array.countOddNumberInMatrix(mat);
    }

}
