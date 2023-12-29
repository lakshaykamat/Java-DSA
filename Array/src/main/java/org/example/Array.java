package org.example;

public class Array {
    static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println("]");
    }

    static void printArray(int[][] twoDArray) {
        for (int[] array : twoDArray) {
            printArray(array);
        }
    }

    static int countItem(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count++;
        }
        return count;
    }
    static int[] swap(int[] arr, int index1, int index2){
        if(index1>=arr.length-1 || index2>=arr.length-1){
            System.out.println("Index can't be greater than array");
            return arr;
        }
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        return arr;
    }
    static int maximumValue(int[] arr){
        int max = arr[0];
        for(int item:arr){
            max = Integer.max(max,item);
        }
        return max;
    }
    static int maximumValueIndex(int[] arr){
        int max = arr[0];
        int index = 0;
        for(int item:arr){
            max = Integer.max(max,item);
        }
        for(int item:arr){
            if(item == max) break;
            index++;
        }
        return index;
    }

    static int[] reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swapping elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        return arr;
    }
    static int countOddNumberInMatrix(int[][] matrix){
        int ans = 0;
        for(int row=0;row<matrix.length;row++){
            for(int col=0;col<matrix[0].length;col++){
                if(matrix[row][col] % 2 != 0){
                    ans++;
                }
            }
        }
        return ans;
    }

    static void incrementCol(int[][] matrix, int col, int value) {
        //Increment all column value

        //check given column is existing or not
        if (col > matrix[0].length - 1) {
            System.out.println("Col don't exist");
            return;
        }

        //finding that column
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (j == col){
                    matrix[i][j] = matrix[i][j] + value;//incrementing
                }
            }
        }
    }

    static void incrementRow(int[][] matrix, int row, int value) {
        //Increment all row value value

        //check given column is existing or not
        if (row > matrix.length - 1) {
            System.out.println("Row don't exist");
            return;
        }

        //finding that row
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == row) {
                    matrix[i][j] = matrix[i][j] + value; //incrementing
                }
            }
        }
    }
    static boolean isMatrixEqual(int[][] mat1, int[][] mat2) {
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1.length; j++) {
                if (mat1[i][j] != mat2[i][j])
                    return false;
            }
        }
        return true;
    }

    static void rotateMatrixClockwise(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        int start = 0, end = matrix.length - 1;
        while (start <= end) {
            for (int i = 0; i < matrix.length; i++) {
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
            }
            start++;
            end--;
        }
    }
}
