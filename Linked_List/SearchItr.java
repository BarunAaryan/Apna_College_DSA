public class SearchItr {
    // search the key in a linked list iteratively
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
    public int itrSearch(int key) { //O(n)
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) { // key found
                return i;
            }
            temp = temp.next;
            i++;

        }
        // key not found
        return -1;

    }
    public static void main(String[] args) {
        SearchItr ll = new SearchItr();
ll.addFirst(5);
ll.addFirst(4);
ll.addFirst(3);
ll.addFirst(2);
ll.addFirst(1);
System.out.println(ll.itrSearch(3));
System.out.println(ll.itrSearch(10));
    }
}
