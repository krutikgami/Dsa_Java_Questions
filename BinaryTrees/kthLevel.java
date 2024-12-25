package BinaryTrees;
import BinaryTrees.treeTraversal.Node;
public class kthLevel {
    public static void level(Node root,int level,int k){
        if (root == null) {
            return;
        }
        if (level == k) {
            System.out.print(root.data+ " ");
            return;
        }

        level(root.left,level+1,k);
        level(root.right,level+1,k);

    }
    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.left = new Node(6);
        node.right.right = new Node(7);
        
        int k =3;
        level(node, 1, k);
        
    }
}
