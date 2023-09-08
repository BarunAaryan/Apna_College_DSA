public class RevLinked {
    //Reversing of a given linked list
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data= data;
            this.next= null;
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
    public void reverse(){
        Node prev= null;
        Node curr= tail = head;
        Node next;
        while(curr!= null){
            next= curr.next;
            curr.next= prev;
            prev= curr;
            curr=next;
        }
        head= prev;
    }
        public void print(){
        if(head== null){
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
        public static void main(String[] args) {
        RevLinked ll = new RevLinked();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        ll.reverse();
        ll.print();
    }
}
