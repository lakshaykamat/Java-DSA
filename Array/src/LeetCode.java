import java.util.Arrays;

public class LeetCode {
    public static int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] newArr = new int[length * 2];
        for(int i = 0; i < length; i++){
            newArr[i] = nums[i];
            newArr[i+length] = nums[i];
        }
        return newArr;
    }
<<<<<<< refs/remotes/origin/master
=======

    public static int[] buildArray(int[] nums) {
        //https://leetcode.com/problems/build-array-from-permutation/
        int[] ans =  new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
<<<<<<< refs/remotes/origin/master
>>>>>>> concatenation of array
=======
    public static int[] runningSum(int[] nums) {
        //https://leetcode.com/problems/running-sum-of-1d-array/
        int[] ans = new int[nums.length];
        for(int i=1;i<nums.length;i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
    public static int[] runningSum2(int[] nums) {
        //https://leetcode.com/problems/running-sum-of-1d-array/
        int[] ans = new int[nums.length];
        if(nums.length == 0){
            return ans;
        }
        ans[0] = nums[0];
        for(int i=1;i<nums.length;i++) {
            ans[i] = nums[i]+ans[i-1];
        }
        return ans;
    }
    public static int maximumWealth(int[][] accounts) {
        //https://leetcode.com/problems/richest-customer-wealth/
        int maxWeath = 0;
        for(int i=0;i<accounts.length;i++){
            int currentWealth = 0;
            for(int j=0;j<accounts[i].length;j++){
                currentWealth += accounts[i][j];
            }
            maxWeath = Integer.max(maxWeath,currentWealth);
        }
        return maxWeath;
    }
    public static int[] shuffle(int[] nums, int n) {
        //https://leetcode.com/problems/shuffle-the-array/description/
        //Under review
        int[] newArr = new int[nums.length];
        for(int i=0;i<nums.length;i++){

        }
        return newArr;
    }
    public static int numIdenticalPairs(int[] nums) {
        //https://leetcode.com/problems/number-of-good-pairs/description/
        int countPair = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if((nums[j] == nums[i]) && (i < j)){
                    countPair++;
                }
            }
        }
        return countPair;
    }
>>>>>>> new array question solved
}
