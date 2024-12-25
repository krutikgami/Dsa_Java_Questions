package BinarySearchTree;
import BinarySearchTree.buildBinaryTree.*;
import BinaryTrees.treeTraversal.buildTree;

public class searchBinary {

    public static boolean search(Node root, int key){
        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }

        if (root.data > key) {
            return search(root.left, key);
        }else{
            return search(root.right, key);
        }
    }
    public static void main(String[] args) {
        int values[] = {5,3,1,0,2};
        int key = 7;
        Node root = null;
        for (int i = 0; i < values.length; i++) {
          root =  buildBinaryTree.insert(root, values[i]);
        }
       
        if (search(root, key)) {
            System.out.println("Found");
        }
        else{
            System.out.println("Not found");
        }

    }
}
