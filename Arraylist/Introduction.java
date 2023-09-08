import java.util.ArrayList;

public class Introduction {
    public   static void main(String[] args) {
        //   Java Collection FrameWork
        //  ClassNAme objectName = new ClassName()
        // calling of constructor
 
        ArrayList<Integer> list  = new ArrayList<>();
        //Arraylist<String> list2 = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1,9); //O(n)
    System.out.println(list);

    //Get Operation=> performs in constant time O(1)
    int element = list.get(2);
    System.out.println(element);

    //delete
    // list.remove(2);
    // System.out.println(list);
//set
    list.set(2,10);
System.out.println(list);

//Contains
System.out.println(list.contains(1));
System.out.println(list.contains(11));
    }
}