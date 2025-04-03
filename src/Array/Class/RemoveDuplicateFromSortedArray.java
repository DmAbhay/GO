package Array.Class;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {

    public static void main(String[] args) {


        int[] arr = {10, 10, 10, 10};
        System.out.println(Arrays.toString(arr));
        System.out.println(removeDuplicate(arr));
        System.out.println(Arrays.toString(arr));
    }

    public static int removeDuplicate(int[] arr){
        int j = 0;
        for(int i = 1;i<arr.length;i++){
            if(arr[j] != arr[i]){
                arr[++j] = arr[i];
            }
        }

        return j;
    }
}
