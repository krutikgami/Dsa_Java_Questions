package BinarySearchTree;
import java.util.ArrayList;

import BinarySearchTree.buildBinaryTree.Node;

public class merge2BST{

    public static void inOrder(Node root,ArrayList<Integer> arr){
        if (root == null) {
            return;
        }

        inOrder(root.left,arr);
        arr.add(root.data);
        inOrder(root.right, arr);
    }

    public static Node createBalancedBst(ArrayList<Integer> finaList ,int start ,int end){
        if (start>end) {
            return null;
        }

        int mid = (start+end)/2;
        Node root = new Node(finaList.get(mid));
        root.left =  createBalancedBst(finaList, start, mid-1);
        root.right = createBalancedBst(finaList, mid + 1, end);

        return root;
    }

    public static Node mergeBST(Node node1,Node node2){
        // Transform into inorder for node1
        ArrayList<Integer> arr1 = new ArrayList<>();
        inOrder(node1,arr1);

        //Transform into inorder for node2
        ArrayList<Integer> arr2 = new ArrayList<>();
        inOrder(node2,arr2);

        //Final merge two array
        ArrayList<Integer> finalList = new ArrayList<>();
        int i=0 ,j=0;
        while (i<arr1.size() && j<arr2.size()) {
            if (arr1.get(i)<arr2.get(j)) {
                finalList.add(arr1.get(i));
                i++;
            }else{
                finalList.add(arr2.get(j));
                j++;
            }
        }

        while (i<arr1.size()) {
            finalList.add((arr1.get(i)));
            i++;
        }

        while (j<arr2.size()) {
            finalList.add(arr2.get(j));
            j++;
        }

       return createBalancedBst(finalList,0,finalList.size()-1);

    }
    public static void main(String[] args) {
        Node node1 = new Node(2);
        node1.left = new Node(1);
        node1.right = new Node(4);

        Node node2 = new Node(9);
        node2.left = new Node(3);
        node2.right = new Node(12);

        
        Node root = mergeBST(node1, node2);
        System.out.print(root.data);
    }
    
}
