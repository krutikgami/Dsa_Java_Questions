package LinkedLists;

public class LinkedList {
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
    public static int size;

    public static void addFirstNode(int data){
        //1. create node 
        
       Node newNode = new Node(data);
       size++;

       if (head == null) {
            head = tail = newNode;
            return;
       }

       //2. assign next to the head 

       newNode.next = head;

       //3.assign head to newnode

       head = newNode;

        
    }

    public static void addLastNode(int data){
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            tail = head = newNode;
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

    public static void addMiddleNode(int index,int data){
        Node newNode = new Node(data);
        size++;
         
        Node temp = head;
        int i = 0;
        while (i<index-1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static int removeFirst(){
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if (size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head= head.next;
        size --;
        return val;
    }
    public static int removeLast(){
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        for(int i=0; i<size-2 ;i++){
            prev = prev.next;
        }
        int val = prev.next.data; // tail.data
          prev.next = null;
          tail = prev;
          size --;
          return val;
    }

    public static int itrSearch(int key){
       
        Node temp = head;
        int i = 0;

        while(temp!=null){
            if (temp.data == key) {
                return i;
            }
                temp = temp.next;
                i++;   
        }

        return -1;
    }
    public static int helper(Node head,int key){
        if (head == null) {
            return -1;
        }

        if (head.data==key) {
            return 0;
        }
        int index = helper(head.next, key);

        if (index == -1) {
            return -1;
        }

        return  index + 1;
    }
    public static int recSearch(int key){
        return helper(head,key);
    }

     public static void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;                
        }
        head = prev;
     }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirstNode(1);
        ll.addFirstNode(2);
        ll.addLastNode(3);
        ll.addLastNode(4);
        ll.addMiddleNode(1, 5);
        ll.print();
        // ll.removeFirst();
        // ll.print();
        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.size);
        // System.out.println(ll.recSearch(3));
        // System.out.println(ll.recSearch(9));
        ll.reverse();
        ll.print();
    }
}
