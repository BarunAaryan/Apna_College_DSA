public class LinkedPalindrome {
    // check if a linked list is palindrome or not
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

    public void print() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // slow- fast approach
    public Node findMid(Node head) { // helper function
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow; // slow is the mid
    }

    public boolean checkPalindrome() {
        // base case
        if (head == null || head.next == null) {
            return true; // automatcally a palindrome if no element present or 1 element present

        }

        // step1 - find mid
        Node midNode = findMid(head);
        // step2 - reverse the 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next; // find the next
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        Node right = prev; // right half head
        // current became null so , prev is at the last node
        Node left = head;
        // step3- check left half and right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedPalindrome ll = new LinkedPalindrome();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        System.out.println(ll.checkPalindrome());
    }
}
