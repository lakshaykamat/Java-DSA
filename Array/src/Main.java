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
        System.out.println(Arrays.toString(n));

    }
}