package Array.Problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArrayDuplicates {

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 3};
        System.out.println(findDuplicates(arr));
    }

    public static List<Integer> findDuplicates(int[] arr){

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i = 0;i<arr.length;i++){
            int x = arr[i];

            hm.put(x, hm.getOrDefault(x, 0)+1);
        }

        ArrayList<Integer> ls = new ArrayList<>();

        for(int i : hm.keySet()){
            int val = hm.get(i);
            if(val > 1){
                ls.add(i);
            }
        }

        return ls;
    }


}
