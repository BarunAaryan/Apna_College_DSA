import java.util.PriorityQueue;
import java.util.*;

public class PQ_in_JCF {
    //Priority Queue in JCF
    public static void main(String[] args) {
        PriorityQueue<Integer> pq= new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(3); //O(logn) //n is the number which already exist in the priority queue
        pq.add(4);
        pq.add(1);
        pq.add(7);
        while(!pq.isEmpty()){
            System.out.print(pq.peek()+ " "); //O(1)
            pq.remove(); //O(logn)

        }
    }
}
