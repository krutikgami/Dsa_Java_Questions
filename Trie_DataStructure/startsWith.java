package Trie_DataStructure;

public class startsWith extends trie_implement {

    public static boolean startwith(String s){
        Node curr = root;
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i)-'a';
            if (curr.children[idx]==null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }
    public static void main(String[] args) {
        String words[] = {"apple","mango","man","woman"};
        String prefix = "app";
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }

        System.out.println(startwith(prefix));
    }
}
