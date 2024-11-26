package LinkedLists;

public class detectCycleAndRetIdx {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public Node hasCycle(Node head) {
        Node prev = null;
        if(head == null || head.next == null){
            return prev;
        }

        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                prev = head;
                while (prev == slow.next.next) {
                    prev = prev.next;
                }
                return prev;
            }
        }

        return prev;
    }
}
