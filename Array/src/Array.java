public class Array {
    static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i]+",");
            }
        }
        System.out.println("]");
    }
    static void printArray(int[][] twoDArray){
        for(int[] array: twoDArray){
            printArray(array);
        }
    }
    static int countItem(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count++;
        }
        return count;
    }
}
