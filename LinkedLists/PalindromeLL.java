package LinkedLists;

public class PalindromeLL  extends LinkedList{
    public static class  Node {
        
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
        
    }
    public static Node head;
    public static Node tail;

    public static Node findMid(Node head){
        Node slow = head;
        Node fast  = head;

        while (fast!=null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static boolean checkPalindrome(){

        if (head == null || head.next == null) {
            return true;
        }
        //1.find mid Node
        Node midNode = findMid(head);
        
        //2.reverse 2 half part of ll
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;

        //3. check left part and right part of ll
        while (right!=null) {
            if (left.data!=right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;

    }
    public static void main(String[] args) {
        
    }
}
