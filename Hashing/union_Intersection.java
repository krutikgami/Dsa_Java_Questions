package Hashing;

import java.util.HashSet;

public class union_Intersection {
    public static void main(String[] args) {
        int arr[] = {7,3,9};
        int arr1[] = {1,2,5,7,5,3};
        HashSet<Integer> s = new HashSet<>();
        int count =0;

        for (int i = 0; i < arr.length; i++) {
            s.add(arr[i]);
        }
        for (int i = 0; i < arr1.length; i++) {
            s.add(arr1[i]);
        }
        System.out.println("Union Size: "+s.size());

        s.clear();

        for (int i = 0; i < arr1.length; i++) {
            s.add(arr1[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if (s.contains(arr[i])) {
                count++;
            }
        }
        System.out.println("Intersection Size: "+count);
    }
}
