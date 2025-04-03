package Array.Class;


// Question : Input: arr[] = {2, 3, -8, 7, -1, 2, 3};
//            Output: 11

// Question : Input: arr[] = {-6, -1, -8};
//            Output: -1

// Question : Input: arr[] = {1, -2, 3, 4, -1, 2, 1, -5, 4};
//            Output: 9

// Question : Input: arr[] = {5, 8, 3};
//            Output: 16

// Question : Input: arr[] = {5, 4, -1, 7, 8};
//            Output: 23

// Question : Input: arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
//            Output: 7


public class MaximumSubArraySum {

    public static void main(String[] args) {

        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};

        System.out.println(maximumSubArraySum(arr));
    }

    public static int maximumSubArraySum(int[] arr){

        int sum = arr[0];
        int res = arr[0];


        for(int i = 1;i<arr.length;i++){
            sum = Math.max(sum+arr[i], arr[i]);
            res = Math.max(res, sum);
        }
        return res;
    }
}
