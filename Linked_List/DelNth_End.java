
public class DelNth_End {
    //remove the nth term from the end

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
public void deleteNthfromEnd(int n){
    //calculate size
    int size=0;
    Node temp =head;
    while(temp!= null){
        temp = temp.next;
        size++;
    }
    //if we want to delete head
    if(n==size){
        head= head.next; //removeFirst
        return;
    }
    //size-n
    int i=1;
    Node prev =head;
    int iToFind = size-n; //index to find
while(i<iToFind){
    prev = prev.next;
    i++;
}
//when we reach our final previous i.e. jisko delete karna hai uske pehle wala element

prev.next = prev.next.next;
return;
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
        DelNth_End ll = new DelNth_End();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
       ll.print();
       ll.deleteNthfromEnd(3);
       ll.print();
    }

}
