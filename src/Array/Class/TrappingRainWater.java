package Array.Class;


import java.util.Arrays;

// Question : Input: arr[] = [3, 0, 1, 0, 4, 0 2]
//            Output: 10
//            Explanation: Total water trapped = 0 + 3 + 2 + 3 + 0 + 2 + 0 = 10 units.
public class TrappingRainWater {

    public static void main(String[] args) {

        int[] arr = {3, 0, 1, 0, 4, 0, 2};
        System.out.println(trappingRainWater(arr));

    }

    public static int trappingRainWater(int[] arr){

        int n = arr.length;
        int[] lmax = new int[n];
        int[] rmax = new int[n];

        int res = 0;

        int lm = arr[0];
        int rm = arr[n-1];

        for(int i = 0;i<n;i++){
           lm  = Math.max(arr[i], lm);
           lmax[i] = lm;
        }

        for(int i = n-1;i>=0;i--){
            rm  = Math.max(arr[i], rm);
            rmax[i] = rm;
        }

        for(int i = 0;i<n;i++){
            res = res + Math.min(lmax[i], rmax[i]) - arr[i];
        }

        System.out.println(Arrays.toString(lmax));
        System.out.println(Arrays.toString(rmax));
        System.out.println(Arrays.toString(arr));

        return res;

    }
}
