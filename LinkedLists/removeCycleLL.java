package LinkedLists;

public class removeCycleLL {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node prev = null;
    

    public static void removeCycle(){

        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
               cycle = true;
                break;          
            }
        }

        if (cycle == false) {
            return;
        }
        
        slow = head;
        while (fast!=slow) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = null;
        
    }
    public static void print(){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        removeCycleLL ll  = new removeCycleLL();
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        removeCycle();
        print();

    }
}
