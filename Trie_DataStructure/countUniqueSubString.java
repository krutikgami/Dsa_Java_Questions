package Trie_DataStructure;

public class countUniqueSubString extends trie_implement{
    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            count+=countNodes(root.children[i]);
        }
       
        return count+1;
    }
    public static void main(String[] args) {
        String s = "ababa";
        for (int i = 0; i < s.length(); i++) {
            String substrings = s.substring(i);
            insert(substrings);
        }

        System.out.println(countNodes(root));
    }
}
