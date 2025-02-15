package Hashing;

import java.util.HashMap;

public class itineraryFromTickets {
    public static String findItinerary(HashMap<String,String> map){
        HashMap<String,String> revMap = new HashMap<>();
        
        for(String key : map.keySet()){
            revMap.put(map.get(key), key);
        }

        for(String key : map.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }

        return null;
    }
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("Chennai", "Bengaluru");
        map.put("Mumbai", "Delhi");
        map.put("Delhi", "Goa");
        map.put("Goa", "Chennai");

        String start = findItinerary(map);
        System.out.print(start);
        for(String key : map.keySet()){
            System.out.print("->" + map.get(start));
            start = map.get(start);
        }

    }
}
