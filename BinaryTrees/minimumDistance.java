package BinaryTrees;

import BinaryTrees.treeTraversal.Node;

public class minimumDistance {

    public static Node lca2(Node root,int n1,int n2){

        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }
        Node left = lca2(root.left, n1, n2);
        Node right = lca2(root.right, n1, n2);

        if (left==null) {
            return right;
        }
        if (right == null) {
            return left;
        }

        return root;
    }

    public static int calcDist(Node root,int n){

        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }
        int leftDist = calcDist(root.left, n);
        int rightDist = calcDist(root.right, n);

        if (leftDist==-1 && rightDist==-1) {
            return -1;
        }else if (leftDist == -1) {
            return rightDist+1;

        }
        else{
            return leftDist+1;
        }
    }

    public static int minDist(Node root,int n1,int n2){
        Node lca = lca2(root,n1,n2);

        int distleft = calcDist(lca,n1);
        int distright  = calcDist(lca,n2);

        return distleft + distright;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.print(minDist(root, 4, 6));
    }
}
