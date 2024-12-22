package BinaryTrees;

import BinaryTrees.treeTraversal.Node;

public class subTreeOfTree {

    public static boolean isIdentical(Node root,Node subroot){
        if (root == null && subroot == null) {
            return true;
        }else if (root == null || subroot == null || root.data != subroot.data) {
            return false;
        }

        if (!isIdentical(root.left, subroot.left)) {
            return false;
        }
        if (!isIdentical(root.right, subroot.right)) {
            return false;
        }

        return true;
    }

    public static boolean isSubTree(Node root,Node subroot){
        if (root == null) {
            return false;
        }
        if (root.data == subroot.data) {
            if (isIdentical(root,subroot)) {
                return true;
            }
        }

        return isSubTree(root.left, subroot) || isSubTree(root.right, subroot);
    }
    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.right = new Node(3);
        node.right.right.right = new Node(6);

        Node subroot = new Node(2);
        subroot.left = new Node(4);
        // subroot.right = new Node(5);

        System.out.println(isSubTree(node,subroot));
    }
}
