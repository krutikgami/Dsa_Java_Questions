package Strings;

import java.util.HashMap;
import java.util.HashSet;

class countVowel {
    public static void vowelStrings(String[] words, int[][] queries) {
        HashMap<Integer,Boolean> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        int ans[] = new int[queries.length];
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int c = 0;
        for(int i=0;i<words.length;i++){
            String s = words[i];
            if(set.contains(s.charAt(0)) && set.contains(s.charAt(s.length()-1))){
                map.put(c,true);
                c++;
            }else{
                map.put(c,false);
                c++;
            }
        }

        for(int j=0;j<queries.length;j++){
            int count = 0;
            int k =queries[j][0];
            int l = queries[j][1];

           while(k<=l){
            if(map.get(k)==true){
                count++;
            }
            k++;
           }
           ans[j] = count;
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+ " ");
        }
    }
    public static void main(String[] args) {
        String words[] = {"aba","bcb","ece","aa","e"};
        int [][] query = {{0,2},{1,4},{1,1}};

        vowelStrings(words,query);
    }
}