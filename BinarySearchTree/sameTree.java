package BinarySearchTree;
import java.util.ArrayList;

import BinarySearchTree.buildBinaryTree.*;
public class sameTree {

    public static void inorder(Node root,ArrayList<Integer> list){
        if (root == null || root.left == null || root.right == null) {
            return;
        }
        list.add(root.data);
        inorder(root.left, list);
        inorder(root.right, list);
    }
    public static boolean isSameTree(Node p, Node q) {
        ArrayList<Integer> list1 = new ArrayList<>();
        inorder(p,list1);
        ArrayList<Integer> list2 = new ArrayList<>();
        inorder(p,list2);

        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i)+" ");
        }
        System.out.println();

        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i)+" ");
        }

        int i =0;
        int j =0;
        boolean a = false;
        while (i<list1.size() && j<list2.size()) {
            if (list1.get(i) == list2.get(i)) {
                i++;
                j++;
                a = true;
            }else{
                a = false;
                break;
            }
        }

        return a;
    } 

    public static void main(String[] args) {
        Node node1 = new Node(1);
        node1.left = new Node(2);
        node1.right = new Node(3);

        Node node2 = new Node(1);
        node2.left = new Node(2);
        node2.right = new Node(3);

        System.out.println(isSameTree(node1,node2));

    }

}


