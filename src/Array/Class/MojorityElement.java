package Array.Class;

public class MojorityElement {

    public static void main(String[] args) {
        int[] arr = {20, 30, 40, 50, 50, 50, 50};

        System.out.println(findMojorityElement(arr));

    }

    public static int findMojorityElement(int[] arr){

        int index = 0;
        int count = 1;

        for(int i = 1;i<arr.length;i++){
            if(arr[i] == arr[index]){
                count++;
            }else{
                count--;
            }
            if(count == 0){
                index = i;
                count = 1;
            }
        }

        int cnt = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == arr[index]){
                cnt++;
            }
        }
        if(cnt>arr.length/2){
            System.out.println(arr[index]);
            return index;

        }
        return -1;
    }

}
