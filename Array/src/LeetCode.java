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
>>>>>>> concatenation of array
}
