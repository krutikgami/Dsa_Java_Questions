package BinaryTrees;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

import BinaryTrees.treeTraversal.Node;

class Info {
    Node node;
    int hd;

    public Info(Node node, int hd){
        this.node = node;
        this.hd = hd;
    }
    
}

public class topViewOfTree {
   
    public static void topView(Node root){
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer,Node> map = new HashMap<>();
        int min =0,max = 0;
        q.add(new Info(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            Info curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                }else{
                    q.add(null);
                }
            }else{
                if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }
    
                if (curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.hd -1));
                    min  = Math.min(min, curr.hd - 1);
                }
    
                if (curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.hd +1));
                    max = Math.max(max, curr.hd + 1);
                }
            }

          
        }

        for (int i = min; i <= max; i++) {
                System.out.print(map.get(i).data + " ");
        }
    }
    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);

        topView(node);
    }
}
