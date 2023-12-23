import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        int[][] arr1 = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };
        int[] n = LeetCode.getConcatenation(array);
<<<<<<< refs/remotes/origin/master
        System.out.println(Arrays.toString(n));
=======
        //System.out.println(Arrays.toString(n));
        System.out.println(Arrays.toString(LeetCode.buildArray(new int[]{0, 2, 1, 5, 3, 4})));
>>>>>>> concatenation of array

    }
}