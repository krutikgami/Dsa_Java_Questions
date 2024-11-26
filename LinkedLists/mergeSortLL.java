package LinkedLists;


public class mergeSortLL {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public static Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while (fast!=null && fast.next!= null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    public static Node merge(Node head1,Node head2){
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while (head1!=null && head2!=null) {
            if (head1.data<=head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head1!=null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2!=null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergeLL.next;
    }
    public static Node mergeSort(Node head){
        if (head==null || head.next == null) {
            return head;
        }
        Node mid = getMid(head);
        Node rightHead  = mid.next;
        mid.next = null;

        Node leftList = mergeSort(head);
        Node rightList = mergeSort(rightHead);
        
        return merge(leftList,rightList);
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
        mergeSortLL ll = new mergeSortLL();
        head = new Node(5);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        print();
    }
}
