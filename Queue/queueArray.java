package Queue;

public class queueArray {
    static class Queue {
       static int arr[];
       static int rear;
       static int size;
        
        Queue(int n){
            arr = new int[n];
            rear = -1;
            size = n;
        }

        public static void isEmpty(){
            if (rear == -1) {
                System.out.println("Queue is empty");
            }
        }

        public static void enqueue(int data){
            if (rear == size - 1) {
                System.out.println("Queue is full");
            }
            rear++;
            arr[rear] = data;
           
        }
        static int front;
        public static int dequeue(){
            if (rear == -1) {
                System.out.println("Queue is empty");
            }
            for(int i= 0;i<rear;i++){
                front = arr[0];
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }

        public static int peek(){
            if (rear == -1) {
                System.out.println("Queue is empty");
            }
            front = arr[0];
            return front;
        }
        
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        while (q.rear != -1) {
            System.out.println(q.peek());
            q.dequeue();
        }
    }
}
