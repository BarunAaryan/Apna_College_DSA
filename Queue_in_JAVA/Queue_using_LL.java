import java.time.chrono.IsoEra;

public class Queue_using_LL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }

    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        // add
        public static void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // remove
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int front = head.data;
            // single element present
            if (tail == head) {
                tail = head = null;
            }else{
                head= head.next;
            }
            return front;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            return head.data;
        }
    }
public static void main(String[] args) {
        Queue q = new Queue(); // 5 is the size of the array
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.print(q.remove());
        q.add(4);
        System.out.print(q.remove());
        q.add(5);
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}
