package Hashing;

import java.util.HashSet;

public class countDistinctElement {
    public static void main(String[] args) {
        int arr []= {1,2,3,4,5,6,1,2,5,6,1};
        HashSet<Integer> s = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            s.add(arr[i]);
        }
        System.out.println(s.size());
    }

}
