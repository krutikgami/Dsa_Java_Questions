package BinarySearchTree;
import java.util.ArrayList;
import java.util.List;

import BinarySearchTree.buildBinaryTree.*;
public class AllElementsBST {

    public static void inOrder(Node root,List<Integer> list){
        if (root == null) {
            return;
        }
        inOrder(root.left, list);
        list.add(root.data);
        inOrder(root.right, list);

    }
     public static List<Integer> getAllElements(Node root1, Node root2) {
        // First tree to convert into list
        List<Integer> list1 = new ArrayList<>();
        inOrder(root1, list1);
        //Second tree to convert into List
        List<Integer> list2 = new ArrayList<>();
        inOrder(root2, list2);

        List<Integer> result = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i<list1.size() && j<list2.size()) {
            if (list1.get(i)<list2.get(j)) {
                result.add(list1.get(i));
                i++;
            }else{
                result.add(list2.get(j));
                j++;
            }
        }

        while (i<list1.size()) {
            result.add(list1.get(i));
            i++;
        }

        while (j<list2.size()) {
            result.add(list2.get(j));
            j++;
        }

        return result;
    }
    public static void main(String[] args) {
        Node node1 = new Node(1);
        // node1.left = new Node();
        node1.right = new Node(8);

        Node node2 = new Node(8);
        node2.left = new Node(1);
        // node2.right = new Node(3);

        List<Integer> result = getAllElements(node1,node2);

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i)+" ");
        }

    }
}
