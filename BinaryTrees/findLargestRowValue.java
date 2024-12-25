package BinaryTrees;

import BinaryTrees.treeTraversal.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class findLargestRowValue {
    
    public static void largestValues(Node root) {
         Queue<Node> q = new LinkedList<>();
         List<Long> list = new ArrayList<>();
            Long max = Long.MIN_VALUE;
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    list.add(max);
                    max = Long.MIN_VALUE;
                    if (!q.isEmpty()) {
                        q.add(null);
                    }
                }else{
                    max = Math.max(max,currNode.data);

                    if (currNode.left!=null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right!=null) {
                        q.add(currNode.right);
                    }
                }
            }
          for(int i = 0;i<list.size();i++){
              System.out.print(list.get(i)+ " ");
          }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(2);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.right = new Node(9);
        largestValues(root);
    }

}
