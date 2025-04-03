package Array.Class;

public class StocKBuyAndSell {

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 8, 12};
        System.out.println(calculateMaxProfit(arr));
    }

    public static int calculateMaxProfit(int[] arr){
        int maxProfit = 0;

        for(int i = 1;i<arr.length;i++){
            if(arr[i-1]<arr[i]){
                int temp = arr[i] - arr[i-1];
                maxProfit = maxProfit + temp;
            }
        }
        return maxProfit;
    }
}
