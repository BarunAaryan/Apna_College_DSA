import java.util.*;

public class InsertInHeap {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) { // O(logn)
            // add at the last index
            arr.add(data);
            int x = arr.size() - 1; // x is the child index
            int par = (x - 1) / 2; // parent index

            while (arr.get(x) < arr.get(par)) { // O(logn)
                // swap
                int temp = arr.get(x); // store child value in temp
                arr.set(x, arr.get(par)); // store parent value in child index
                arr.set(par, temp); // store child value in parent index

                // updation of pointer after swapping
                x = par;
                par = (x - 1) / 2;
            }
        }

        public int peek() {
            return arr.get(0);
        }

    }

    public static void main(String[] args) {

    }
}
