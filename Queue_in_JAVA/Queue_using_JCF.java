import java.util.*;

public class Queue_using_JCF {
    public static void main(String[] args) {
        //Queue q = new Queue(); // 5 is the size of the array
        Queue<Integer> q= new LinkedList<>(); //ArrayDeque
        q.add(1);
        q.add(2);
        q.add(3);
        
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}
