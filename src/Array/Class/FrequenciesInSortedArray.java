package Array.Class;

public class FrequenciesInSortedArray {

    public static void main(String[] args) {

        int[] arr = {10, 10, 25, 30, 30};

        countFrequencies(arr);

    }
    public static void countFrequencies(int[] arr){

        int count = 1;
        for(int i = 1;i<arr.length;i++){
            if(arr[i-1] == arr[i]){
                count++;
            }else{
                System.out.println(arr[i-1]+" --> "+count);
                count = 1;
            }
        }
        System.out.println(arr[arr.length-1]+" --> "+count);
    }
}
