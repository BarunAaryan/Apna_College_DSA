public class Intro_Linked {
    // creation of a single node
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

    public void addLast(int data) {
        // step1 = create new node
        Node newNode = new Node(data);
        size++;
        // if my linked list is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

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

public void add(int idx, int data){
    if(idx==0){
        addFirst(data);
        return;
    }
    Node newNode = new Node(data);
    size++;
    Node temp= head;
    int i=0; //track the temp Node
    while(i<idx-1){
        temp = temp.next; //traversing and going to next node
i++;

    }
    //i= idx-1; temp-> prev
    newNode.next= temp.next;
    temp.next = newNode;
}

public int removeFirst(){
    if(size==0){
        System.out.println("LL is empty");
        return Integer.MAX_VALUE; //infinity
    }else if(size==1){
        //if only one node present
        int val= head.data;
        head =tail= null;
        size=0;
        return val;
    }
    int val= head.data;
    head= head.next;
    size--;
    return val;
}

public int removeLast(){
if(size ==0){
    System.out.println("LL is empty");
    return Integer.MIN_VALUE; //minus-infinity
}else if(size==1){
        //if only one node present
        int val= head.data;
        head =tail= null;
        size=0;
        return val;
    }
    //prev: i= size-2; last index is size-1
Node prev= head;
for(int i=0; i<size-2; i++){
    prev= prev.next;
}
int val= prev.next.data; //tail data
prev.next= null;
tail= prev;
size--;
return val;
}
    public static void main(String[] args) {
        Intro_Linked ll = new Intro_Linked(); // creating a linked list
        // ll.head = new Node(1);
        // ll.head.next = new Node(2);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2, 9);
        ll.print();

ll.removeFirst();
ll.print();

ll.removeLast();
ll.print();
System.out.println(ll.size);
    }
}
