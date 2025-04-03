package Array.Class;

public class SubArrayWithGivenSum {

    public static void main(String[] args) {

        int[] arr = {2, 4};
        int sum = 3;
        System.out.println(subArrayWithGivenSum(arr, sum));
    }
    public static boolean subArrayWithGivenSum(int[] arr, int sum){

        int j = 0;
        int curr = 0;
        for (int k : arr) {

            if (curr < sum) {
                curr = curr + k;
            }
            while (curr > sum) {
                curr = curr - arr[j++];
            }
            if (curr == sum) {
                return true;
            }
        }
        return false;
    }
}
