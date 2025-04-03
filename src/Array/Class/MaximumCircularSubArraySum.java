package Array.Class;

// Question : Input: arr[] = {5, -2, 3, 4};
//            Output: 12

// Question : Input: arr[] = {2, 3, -4};
//            Output: 5

// Question : Input: arr[] = {8, -4, 3, -5, 4};
//            Output: 12

// Question : Input: arr[] = {-3, 4, 6};
//            Output: 10

// Question : Input: arr[] = {-8, 7, 6};
//            Output: 13

// Question : Input: arr[] = {-5, 2, -3, -4};
//            Output: 2

public class MaximumCircularSubArraySum {

    public static void main(String[] args) {
        int[] arr = {-5, 2, -3, -4};
        System.out.println(maximumCircularSubArraySum(arr));
    }

    public static int maximumCircularSubArraySum(int[] arr){

        int normalMax = maximumSubArraySum(arr);
        if (normalMax<0){
            return normalMax;
        }

        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum = sum + arr[i];
            arr[i] = -arr[i];
        }

        int circularMax = sum + maximumSubArraySum(arr);

        return Math.max(normalMax, circularMax);

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
