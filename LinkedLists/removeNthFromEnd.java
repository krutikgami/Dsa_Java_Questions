package LinkedLists;

public class removeNthFromEnd {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;


    public static void addLast(int data){
        Node newNode  = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }
        
        tail.next = newNode;
        tail = newNode;
    }

    public static void print(){
        Node temp = head;

        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void removeNthNode(int key){
        int size = 0;
        Node temp = head;

        while (temp!= null) {
            temp = temp.next;
            size++;
        }

        if (key == size) {
            head = head.next;
            return;
        }

        int i = 1;
        int iToFind = size-key;
        Node prev = head;

        while (i<iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
        
    }
    public static void main(String[] args) {
        removeNthFromEnd ll  = new removeNthFromEnd();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        ll.removeNthNode(2);
        ll.print();
    }
}
