package Array.Class;

public class SecondLargestElement {

    public static void main(String[] args) {
        int[] arr = {12, 12, 12};

        System.out.println(secondLargest(arr));

    }

    public static int secondLargest(int[] arr){
        int lar = arr[0];
        int res = -1;


        for(int i = 1;i<arr.length;i++){
            if(lar<arr[i]){
                res = lar;
                lar = arr[i];
            }else if(lar>arr[i] && res<arr[i]){
                res = arr[i];
            }
            System.out.println(res);
        }
        return res;
    }


}
