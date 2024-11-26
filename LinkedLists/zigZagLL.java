package LinkedLists;


public class zigZagLL {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public static Node findMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while (fast!= null && fast.next!= null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void zigzag(Node head){
        // find mid Node
        Node mid = findMid(head);

        // reverse the ll
        Node prev = null;
        Node curr = mid.next;
        Node next;

        while (curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // merge the ll
        Node rightHead = prev;
        Node leftHead = head;
        Node lCurrHead,rCurrHead;

        while (leftHead!=null && rightHead!=null) {
            lCurrHead = leftHead.next;
            leftHead.next = rightHead;
            rCurrHead = rightHead.next;
            rightHead.next = lCurrHead;

            leftHead = lCurrHead;
            rightHead = rCurrHead;
        }
    }
}
