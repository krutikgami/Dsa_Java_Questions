package Queue;

public class circularQueue {

    public static class Queue {
       static int arr[];
        static int rear,front;
        static int size;
        public Queue(int n){
            arr = new int[n];
            rear = -1;
            front = -1;
            size = n;
        }
        public static boolean isEmpty(){
            if (rear == -1 && front == -1) {
               return true;
            }
            return false;
        }

        public static boolean full(){
            if ((rear+1)%size == front) {
                return true;
            }
            return false;
        }
        public static void enqueue(int n){
            if (full()) {
                System.out.print("Queue is full");
                return;
            }
            if (front ==-1) {
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = n; 
        }

        public static int dequeue(){
            if (isEmpty()) {
                System.out.print("Queue is empty");
                return -1;
            }
            int result = arr[front];
            
            if (front == rear) {
                front = rear =-1;
            }else{
                front = (front+1)%size;
            }
            return result;
        }
        public static int peek(){
            if (isEmpty()) {
                System.out.print("Queue is Empty");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
       Queue q = new Queue(5);
       q.enqueue(1);
       q.enqueue(2);
       q.enqueue(3);
       System.out.println(q.dequeue());
       q.enqueue(4);
       System.out.println(q.dequeue());
       q.enqueue(5);

       while (q.isEmpty()) {
        System.out.print(q.peek());
        q.dequeue();
       }

    }
}
