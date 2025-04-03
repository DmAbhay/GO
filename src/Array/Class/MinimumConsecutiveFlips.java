package Array.Class;

public class MinimumConsecutiveFlips {

    public static void main(String[] args) {
        //int[] arr = {1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1};
        int[] arr = {1, 1, 0, 0, 0, 1};
        //int[] arr = {0, 1};
        minimumFlips(arr);
    }

    public static void minimumFlips(int[] arr){

        int si = 0;
        int ei = 0;
        int start = arr[0];
        int groupMember = -1;
        boolean gotSecond = false;


        for(int i = 0;i<arr.length;i++){
            if(!gotSecond && arr[i] != start){
                groupMember = arr[i];
                gotSecond = true;
                si = i;
            }
            if(gotSecond){
                if(groupMember == arr[i]){
                    ei = i;
                    if(i == arr.length-1){
                        System.out.println(si+" to "+ei);
                    }
                    continue;
                }else{
                    System.out.println(si+" to "+ei);
                    gotSecond = false;
                }
            }
            if(gotSecond){
                System.out.println(si+" to "+ei);
            }
        }

    }
}
