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
}
