
public class Queues_using_arrays {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;

        Queue(int n) { // constructor
            arr = new int[n];
            size = n;
            // front will always point towards 0 index but rear will change as we add
            // elements
            rear = -1;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        // add
        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        // remove element from first
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;

            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear = rear - 1;
            return front;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5); // 5 is the size of the array
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}
