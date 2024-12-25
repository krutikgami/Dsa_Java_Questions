package BinarySearchTree;


public class buildBinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;
    
        public Node (int data){
            this.data = data;
        }
    }

    public static Node insert(Node root ,int val){
        if (root == null) {
           return root = new Node(val);
        }

        if (root.data>val) {
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inorder(Node root){
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+ " ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        int values[] = {5,3,2,1,6};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
           root =  insert(root,values[i]);
        }

        inorder(root);
    }
}
