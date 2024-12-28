package BinarySearchTree;
import BinarySearchTree.buildBinaryTree.*;

public class deleteNode {

    public static Node getSuccesor(Node root){
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static Node delete(Node root,int key){
        if (root.data>key) {
            root.left = delete(root.left, key);
        }
        else if(root.data<key){
            root.right = delete(root.right, key);
        }else{
            //Case 1.
            if (root.left == null && root.right == null) {
                return null;
            }
            //Case 2.

            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }
            // Case 3.
            Node Is = getSuccesor(root.right);
            root.data = Is.data;
            root.right = delete(root.right, Is.data);
        }

        return root;
    }
    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.left = new Node(6);
        node.right.right = new Node(7);
        buildBinaryTree.inorder(node);
        System.out.println();

       Node root = delete(node, 7);

        buildBinaryTree.inorder(root);
        System.out.println();
    }
}
