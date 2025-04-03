package Array.Class;

public class EquilibiriumPoint {

    public static void main(String[] args) {

        int[] arr = {4, 2, -2};
        System.out.println(isEquilibiriumPoint(arr));
    }

    public static boolean isEquilibiriumPoint(int[] arr){

        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        int leftSum = 0;
        int rightSum = sum;

        for(int i = 0;i<arr.length;i++){

            rightSum = rightSum - arr[i];
            if(leftSum == rightSum){

                return true;
            }
            leftSum = leftSum + arr[i];
        }
        return false;

    }
}
