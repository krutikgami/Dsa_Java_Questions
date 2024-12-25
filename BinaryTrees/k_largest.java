package BinaryTrees;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

import BinaryTrees.treeTraversal.Node;

public class k_largest {
    public static long kthLargestLevelSum(Node root, int k){
            Queue<Node> q = new LinkedList<>();
            ArrayList<Integer> list = new ArrayList<>();
            int sum = 0;

            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                   
                    list.add(sum);
                    sum = 0;
        
                    if (!q.isEmpty()) {
                        q.add(null); 
                    }
                } else {
                    sum += currNode.data;
        
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
            list.sort(Comparator.reverseOrder());

            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i)+ " ");
            }
           
            if (k > list.size()) {
                return -1;
            }
            
          return list.get(k-1); 
        }
    public static void main(String[] args) {
        Node node = new Node(5);
        node.left = new Node(8);
        node.right = new Node(9);
        node.left.left = new Node(2);
        node.left.right = new Node(1);
        node.left.left.left = new Node(4);
        node.left.left.right = new Node(6);
        node.right.left = new Node(3);
        node.right.right = new Node(7);
        int k = 2;
        System.out.println(kthLargestLevelSum(node,k));
    }
}
