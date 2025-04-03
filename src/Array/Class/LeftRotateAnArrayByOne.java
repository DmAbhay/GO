package Array.Class;

import java.util.Arrays;

public class LeftRotateAnArrayByOne {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(Arrays.toString(arr));
        leftRotateByOne(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void leftRotateByOne(int[] arr){

        int temp = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = temp;
    }
}
