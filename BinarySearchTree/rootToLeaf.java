package BinarySearchTree;
import java.util.ArrayList;

import BinarySearchTree.buildBinaryTree.*;

public class rootToLeaf {

    public static void printPath(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+"-->");
        }
        System.out.println("Null");
    }

    public static void path(Node root,ArrayList<Integer> list){
       if (root == null) {
            return;
       }
       
       list.add(root.data);
       if (root.left == null && root.right == null) {
        printPath(list);  
    }
       path(root.left, list);
       path(root.right, list);
       list.remove(list.size()-1);
    }
    public static void main(String[] args) {
        Node node = new Node(8);
        node.left = new Node(5); 
        node.right = new Node(10); 
        node.left.right = new Node(6); 
        node.left.left = new Node(3); 
        node.right.right = new Node(11); 
        node.right.right.right = new Node(14); 
        path(node,new ArrayList<>());
    }
}
