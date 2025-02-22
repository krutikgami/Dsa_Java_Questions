package Trie_DataStructure;

public class trie_implement {
    public static class Node{
        Node children[] = new Node[26];
        boolean eow = false;
        
        public Node(){
            for (int i = 0; i <26; i++) {
                children[i] = null;
            }
        }
    
    }
   
    public static Node root = new Node();
    
        public static void insert(String word){
           Node curr = root;
            for (int level = 0; level < word.length(); level++) {
                int idx = word.charAt(level) - 'a';
                
                if (curr.children[idx]==null) {
                    curr.children[idx] = new Node();
                }
                curr = curr.children[idx];

            }

            curr.eow = true;
        }

        public static boolean search(String word){
            Node curr = root;
            for (int i = 0; i < word.length(); i++) {
                int idx = word.charAt(i) - 'a';
                if(curr.children[idx]==null){
                    return false;
                }
                curr = curr.children[idx];
            }
            return curr.eow == true;
        }
    public static void main(String[] args) {
        String arr[] = {"there","the","a","thee","any"};

        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }
        System.out.println(search("there"));
        System.out.println(search("th"));
    }    
}
