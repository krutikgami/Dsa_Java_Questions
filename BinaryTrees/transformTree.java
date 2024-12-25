package BinaryTrees;

import BinaryTrees.treeTraversal.Node;


public class transformTree {

    public static int  transform(Node root){
        if (root == null) {
            return 0;
        }

        int left = transform(root.left);
        int right = transform(root.right);

        int data = root.data;

        int newLeft = root.left == null ? 0 :root.left.data;
        int newright = root.right == null? 0 :root.right.data;

        root.data = newLeft + left + newright + right;

        return data;

    }


    public static void preOrder(Node root){
        if (root == null) {
            return;
        }

        System.out.print(root.data+  "  ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);


        transform(root);
        preOrder(root);

    }
}
