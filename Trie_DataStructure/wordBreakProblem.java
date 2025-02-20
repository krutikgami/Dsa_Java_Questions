package Trie_DataStructure;
//i have extended the trie_implement class which i have created in Trie_DataStructure Package for basic insert and search function.
public class wordBreakProblem extends trie_implement{

    public static boolean wordSearch(String s){
        if (s.length() ==0) {
            return true;
        }

        for (int i = 1; i <= s.length(); i++) {
            if (search((s.substring(0,i))) && wordSearch(s.substring(i))) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String arr[]= {"i","like","sam","samsung","mobile","ice"};
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }
        String key  = "ilikesamsung";
        System.out.println(wordSearch(key));
    }
}
