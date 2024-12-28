package BinarySearchTree;

import BinarySearchTree.buildBinaryTree.*;
public class sortedArrayBST {
    public static Node Sorted(int nums[],int start,int end){
        if (start>end) {
            return null;
        }

        int mid = (start+end)/2;
        Node root = new Node(nums[mid]);

        root.left = Sorted(nums, start, mid-1);
        root.right = Sorted(nums, mid+1, end);
        return root;

    }
    public static void main(String[] args) {
        int nums[] = {1,3};

       Node root =  Sorted(nums, 0, nums.length-1);

        buildBinaryTree.inorder(root);
    }
}
