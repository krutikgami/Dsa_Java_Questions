package Trie_DataStructure;

public class longestWordPrefixes extends trie_implement{
public static String ans = "";
    public static void longestWord(Node root,StringBuilder str){
        if(root == null){
            return;
        }

        for (int i = 0; i <26; i++) {
            if (root.children[i]!=null && root.children[i].eow==true) {
            char ch = (char) (i+'a');
            str.append(ch);
            if (str.length() > ans.length()) {
                ans = str.toString();
            }
                longestWord(root.children[i], str);
                str.deleteCharAt(str.length()-1);
            }
        }
    }
    public static void main(String[] args) {
        String arr[] = {"a","banana","a","app","apple","apply"};
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }

        longestWord(root,new StringBuilder(""));
        System.out.println(ans);
    }
}
