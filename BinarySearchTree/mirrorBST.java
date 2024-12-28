package BinarySearchTree;

import BinarySearchTree.buildBinaryTree.*;
public class mirrorBST {

    public static Node mirror(Node root){
        if (root == null) {
            return null;
        }

        Node leftMirror = mirror(root.left);
        Node rightMirror = mirror(root.right);

        root.left = rightMirror;
        root.right = leftMirror;

        return root;
    }
    public static void main(String[] args) {
        Node node = new Node(8);
        node.left = new Node(5);
        node.right = new Node(10);
        node.left.left = new Node(3);
        node.left.right = new Node(6);
        node.right.right = new Node(11);
        
        buildBinaryTree.inorder(node);

        mirror(node);
        System.out.println();

        buildBinaryTree.inorder(node);

    }
}
