import java.util.*;
public class PQ_forObject {

    //implement an interface
    static class Student implements Comparable<Student> { 
        //we are going to compare Objects of students class
        String name;
        int rank;
        //creating a constructor
        public Student(String name, int rank){
            this.name= name;
            this.rank = rank;
        }
        //ovveride
        @Override
        //compareTo => function
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }
     public static void main(String[] args) {
        PriorityQueue<Student> pq= new PriorityQueue<>();
        pq.add(new Student("A", 4)); //O(logn) //n is the number which already exist in the priority queue
        pq.add(new Student("B", 5));
        pq.add(new Student("C", 2));
        pq.add(new Student("D", 12));
        

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name + " "+pq.peek().rank); //O(1)
            pq.remove(); //O(logn)

        }
    }
}
