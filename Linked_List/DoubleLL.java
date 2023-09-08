public class DoubleLL {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node (int data){
            this.data = data;
            this.next= null;
            this.prev= null;

        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //add
public void addFirst(int data){
    Node newNode = new Node(data);
    size++;
    if(head ==null){
        head= tail= newNode;
        return;
    }
    newNode.next = head;
    head.prev= newNode;
    head= newNode;
}
//print 
public void print(){
    Node temp = head;
while(temp!= null){
    System.out.print(temp.data+ "<->");
    temp = temp.next;
}
System.out.println("Null");
}

//remove - removeLast 
public int removeFirst(){
    //when empty
    if(head== null){
        System.out.println("DLL is Empty");
        return Integer.MIN_VALUE;
    }
    //when one element present
    if(size==1){
        int val = head.data;
        head= tail=null;
        size--;
        return val;
    }
    int val = head.data;
    head= head.next;
    head.prev = null;
    size--;
    return val;
}
    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        System.out.println("Size "+ dll.size);
        dll.removeFirst();
        dll.print();
        System.out.println("Size "+ dll.size);

    }
}
