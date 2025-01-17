package Strings;

import java.util.HashMap;

public class minimumLenString {
    public static int minimumLength(String s) {
        if(s.length()<=2){
            return s.length();
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }
        int count = 0;
        for(Character c: map.keySet()){
            if (map.get(c)%2!=0) {
                count++;
            }else{
               if (map.get(c)%2==0) {
                count+=2;
               }
            }
        }
        return count;
        
    }

    public static void main(String[] args) {
        String s = "abaacbcbb";
        System.out.println(minimumLength(s));
    }
}

