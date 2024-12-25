package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class treeTraversal {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class buildTree{
        static int idx = -1;
        public static Node buildTrees(int nodes []){
            idx ++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTrees(nodes);
            newNode.right = buildTrees(nodes);

            return newNode;
        }

        public static void preOrder(Node root){
            if (root == null) {
                return;
            }
            System.out.print(root.data+ " ");
            preOrder(root.left);
            preOrder(root.right);
        }
        public static void inOrder(Node root){
            if (root == null) {
                return;
            }
            inOrder(root.left);
            System.out.print(root.data+  " ");
            inOrder(root.right);

        }

        public static void postOrder(Node root){
            if (root == null) {
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+ " ");
        }

        public static void levelOrder(Node root){
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    // System.out.println();
                    if (q.isEmpty()) {
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data+ " ");
                    if (currNode.left!=null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right!=null) {
                        q.add(currNode.right);
                    }
                }
            }
        }

        public static int heightTree(Node root){
            if (root == null) {
                return 0;
            }

            int lh = heightTree(root.left);
            int rh = heightTree(root.right);
            return Math.max(lh, rh) + 1;
        }

        public static int countNode(Node root){
            if (root == null) {
                return 0;
            }

            int lc = countNode(root.left);
            int rc = countNode(root.right);

            return lc + rc + 1;
        }

        public static int sumNode(Node root){
            if (root == null) {
                return 0;
            }

            int ls = sumNode(root.left);
            int rs = sumNode(root.right);

            return ls + rs + root.data;
        }

        public static int diamTree(Node root){
            if (root == null) {
                return 0;
            }

            int leftdiam = diamTree(root.left);
            int rightdiam = diamTree(root.right);
            int lh = heightTree(root.left);
            int rh = heightTree(root.right);

            int selfdiam = lh + rh + 1;

            return Math.max(selfdiam,Math.max(leftdiam,rightdiam));
        }
    }
    public static void main(String[] args) {
       int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
       buildTree tree = new buildTree();
    //    Node root = tree.buildTrees(nodes); 
    // //    System.out.println(root.data);
    //     tree.preOrder(root);
    //     System.out.println();
    //     tree.inOrder(root);
    //     System.out.println();
    //     tree.postOrder(root);
    //     System.out.println();
     
    Node node = new Node(5);
        node.left = new Node(8);
        node.right = new Node(9);
        node.left.left = new Node(2);
        node.left.right = new Node(1);
        node.left.left.left = new Node(4);
        node.left.left.right = new Node(6);
        node.right.left = new Node(3);
        node.right.right = new Node(7);
    tree.levelOrder(node);

    // System.out.println(tree.heightTree(node));
    // System.out.println(tree.countNode(node));
    // System.out.println(tree.sumNode(node));
    // System.out.println(tree.diamTree(node));
    }
}
