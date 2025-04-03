package Array.Class;


// Question : Input: arr[] = [0, 1, 1, 0, 1, 0]
//            Output: 2

// Question : Input: arr[] = [1, 1, 1, 1,]
//            Output: 4

// Question : Input: arr[] = [0,  0,  0]
//            Output: 0

// Question : Input: arr[] = [1,  0,  1, 1, 1, 1, 0, 1, 1]
//            Output: 4

public class MaximumConsecutiveOne {


    public static void main(String[] args) {
        int[] arr  = {1,  0,  1, 1, 1, 1, 0, 1, 1};

        System.out.println(maximumConsecutiveOne(arr));

    }

    public static int maximumConsecutiveOne(int[] arr){

        int count = 0;
        int res = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 1){
                count++;
                res = Math.max(res, count);
            }else{
                count = 0;
            }
        }
        return res;
    }


}
