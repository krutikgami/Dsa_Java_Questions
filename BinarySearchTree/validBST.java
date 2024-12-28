package BinarySearchTree;

import BinarySearchTree.buildBinaryTree.*;
public class validBST {

    public static boolean isValid(Node root,Node min,Node max){
        if (root == null) {
            return false;
        }
        if (min!=null && root.data<=min.data) {
           return false; 
        }
        else if (max!=null && root.data >= max.data) {
            return false;
        }else{
            return isValid(root.left, min, root) && isValid(root.right, root, max);
        }

    }
    public static void main(String[] args) {
        Node node = new Node(3);
        node.left = new Node(2);
        node.right = new Node(5);
        node.left.left = new Node(1);
        node.right.left = new Node(4);
        System.out.println(isValid(node, null, null));
    }
}
