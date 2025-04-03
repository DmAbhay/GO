package Array.Class;

import java.util.Arrays;

public class MoveZerosToEnd {

    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 0, 12};

        System.out.println(Arrays.toString(arr));
        moveZeroToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZeroToEnd(int[] arr){

        int j = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    public static void moveZeroToStarting(int[] arr){

        int j = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
}
