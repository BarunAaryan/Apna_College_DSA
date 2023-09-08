public class SearchRecurr {
    // search the value in the key recurrsively
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        // step1 = create new node
        Node newNode = new Node(data);
        size++;
        // if my linked list is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step2=> newNode next = head
        newNode.next = head; // linking step
        // step 3 => head = newNode
        head = newNode;
    }

    public int helper(Node head, int key) { //O(n)
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);//is helper able to find the key in the rest of the elements
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    public static void main(String[] args) {
        SearchRecurr ll = new SearchRecurr();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        System.out.println(ll.recSearch(3));
        System.out.println(ll.recSearch(10));
    }
}
