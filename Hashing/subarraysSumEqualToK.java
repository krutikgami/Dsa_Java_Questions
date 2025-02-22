package Hashing;

import java.util.HashMap;

public class subarraysSumEqualToK {
    public static void main(String[] args) {
        int arr[]= {1,2,3};
        int k =3;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int sum =0;
        int ans = 0;
        map.put(0, 1);
        for (int j = 0; j < arr.length; j++) {
            sum+=arr[j];
            if (map.containsKey(sum-k)) {
                ans+=map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }

        System.out.println("Total Subarrays: "+ans);
    }
}
