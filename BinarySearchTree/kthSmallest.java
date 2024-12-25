package BinarySearchTree;

import java.util.ArrayList;

import BinarySearchTree.buildBinaryTree.Node;


public class kthSmallest {
    public static void inOrder(Node root,ArrayList<Integer> list){
        if (root == null) {
            return;
        }
        inOrder(root.left, list);
        list.add(root.data);
        inOrder(root.right, list);
    }
    public static int kthSmallest(Node root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        inOrder(root, list);
        return list.get(k-1);
    }
    public static void main(String[] args) {
        Node node = new Node(3);
        node.left = new Node(1);
        node.right = new Node(4);
        node.left.right = new Node(2);
        System.out.println(kthSmallest(node, 1));
    }
}
