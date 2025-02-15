package Hashing;

import java.util.*;

public class majorityElement {
    public static void freq(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        Set<Integer> set = map.keySet();
        for (Integer key : set) {
            if (map.get(key)> arr.length/3) {
                System.out.println(key);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1,1,2,3,4,5};
        freq(arr);
    }
}
