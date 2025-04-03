package Array.Class;

public class LargestElement {

    public static void main(String[] args) {
        int[] arr = {12, 65, 34, 12, 43,456};
        System.out.println(largestElement(arr));

    }

    public static int largestElement(int[] arr){
        int lar = arr[0];
        for(int i = 1;i<arr.length; i++){
            if(lar<arr[i]){
                lar = arr[i];
            }
        }
        return lar;
    }
}
