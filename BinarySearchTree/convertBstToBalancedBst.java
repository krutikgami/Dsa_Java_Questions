package BinarySearchTree;

import java.util.ArrayList;

import BinarySearchTree.buildBinaryTree.Node;

public class convertBstToBalancedBst {

    public static void getInorder(Node root,ArrayList<Integer> list){
        if (root == null) {
            return;
        }
        
        getInorder(root.left, list);
        list.add(root.data);
        getInorder(root.right, list);

    }

    public static Node createBST(ArrayList<Integer> list,int start,int end){
        if (start>end) {
            return null;
        }

        int mid = (start+end)/2;
        Node root = new Node(list.get(mid));
        root.left = createBST(list, start, mid-1);
        root.right = createBST(list, mid +1, end);

        return root;
    }

    public static Node balanced(Node root){
        if (root == null) {
            return null;
        }
        //convert in inOrder
        ArrayList<Integer> list = new ArrayList<>();
        getInorder(root,list);

        // cretate BST  
        int start = 0;
        int end = list.size()-1;

        root = createBST(list,start,end);
        return root;    
    }
    public static void main(String[] args) {
        Node node = new Node(8);
        node.left = new Node(6);
        node.left.left = new Node(5);
        node.left.left.left = new Node(3);
        node.right = new Node(10);  
        node.right.right = new Node(11);  
        node.right.right.right = new Node(12);  

        Node root = balanced(node);
        buildBinaryTree.inorder(root);
    }
}
