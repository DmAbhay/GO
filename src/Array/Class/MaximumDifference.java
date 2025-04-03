package Array.Class;

public class MaximumDifference {

    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 4, 8, 1};

        System.out.println(maxDifference(arr));
    }

    public static int maxDifference(int[] arr){

        int res = Integer.MIN_VALUE;

        int smallest = arr[0];

        for(int i = 1;i<arr.length;i++){
            int temp = arr[i]-smallest;
            smallest = Math.min(smallest, arr[i]);
            if(temp>res){
                res = temp;
            }
        }

        return res;
    }
}
