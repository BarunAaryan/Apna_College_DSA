public class Circular_Queue_usingArray {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) { // constructor
            arr = new int[n];
            size = n;
            // front will always point towards 0 index but rear will change as we add
            // elements
            rear = -1;
            front = -1;

        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
            // we are trying to increase the rear but the front is present in the next index
        }

        // add
        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            // if adding first element
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // remove element from first
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            int result = arr[front]; // storing the value of element in the result
            // when we are deleting the last element
            if (rear == front) {
                rear = front = -1;

            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[front];
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue(3); // 5 is the size of the array
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
