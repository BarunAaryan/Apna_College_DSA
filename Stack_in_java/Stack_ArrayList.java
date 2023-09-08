import java.util.ArrayList;
public class Stack_ArrayList {
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        //checks if list is empty or not
        public static boolean isEmpty(){
            return list.size()==0;
        }
        //push
public static void push(int data){
    list.add(data);
}
//pop
public static int pop(){
    if(isEmpty()){ //if list is empty
        return -1;
    }
    //int because we need to return the data after deleting it from the stack
    int top= list.get(list.size()-1); //last value stored in our index
    list.remove(list.size()-1);
    return top;

}

//peek
public static int peek(){
    if(isEmpty()){ //if list is empty
        return -1;
    }
    int top= list.get(list.size()-1);
    return top;
}
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();

        }
    }
}
