package Array.Class;

public class WindowSlidingTechnique {

    public static void main(String[] args) {

        int[] arr = {1, 8, 30, -5, 20, 7};
        int k = 3;

        System.out.println("answer "+maximumWindow(arr, k));

    }

    public static int maximumWindow(int[] arr, int k){

        int window = 0;
        int res = Integer.MIN_VALUE;

        for(int i = 0;i<k;i++){
            window = window + arr[i];
        }
        System.out.println(window);
        res = window;

        for(int i = k;i<arr.length;i++){
            window = window-arr[i-k]+arr[i];
            res = Math.max(window, res);
            System.out.println(window);
        }
        return res;
    }
}
