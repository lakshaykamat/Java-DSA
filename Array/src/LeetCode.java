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
}
