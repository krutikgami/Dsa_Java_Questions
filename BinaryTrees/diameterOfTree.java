package BinaryTrees;

public class diameterOfTree {   
    public static class Node {
        Node left;
        Node right;
        int val ;
        public Node(int val){
            this.left = null;
            this.right = null;
            this.val = val;
        }
    }

    public static class Info {
        int diam;
        int height;
    
        public Info(int diam,int height){
            this.diam = diam;
            this.height = height;
        }
        
    }

    public static Info diamTree(Node root){

        if (root == null) {
            return new Info(0, 0);
        }

        Info leftInfo  = diamTree(root.left);
        Info rightInfo = diamTree(root.right);

        int diam = Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.height + rightInfo.height + 1);
        int height = Math.max(leftInfo.height, rightInfo.height);
        return new Info(diam, height);
    }
    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.right = new Node(3);
        node.right.right.right = new Node(6);

        // System.out.println();
        System.out.println(diamTree(node).diam);
    }
}
