package Trie_DataStructure;

public class prefixProblem {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;
        int freq;

        public Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
            freq = 0; 
            
        }
    }

    public static Node root = new Node();

    public static void insert(String s) {
        Node curr = root;
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
            curr.freq++;
        }
        curr.eow = true;
    }

    public static String prefix(String s) {
        Node curr = root;
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            curr = curr.children[idx];
            st.append(s.charAt(i));
            if (curr.freq == 1) {
                break; 
            }
        }
        return st.toString();
    }

    public static void main(String[] args) {
        String arr[] = {"zebra", "dog", "duck", "dove"};
        String ans[] = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]); 
        }

        for (int i = 0; i < arr.length; i++) {
            ans[i] = prefix(arr[i]); 
        }
        for (String string : ans) {
            System.out.println(string);
        }
    }
}
