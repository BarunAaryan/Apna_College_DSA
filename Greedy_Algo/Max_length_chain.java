import java.util.*;

public class Max_length_chain { //O(nlogn) => becoz we did sorting
    // maximum length chain of pairs
    public static void main(String[] args) {
        int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));
        // 1st column => 2nd number basis sorting

        int chainLen = 1; // weh have to pic teh first element anyhow
        int chainEnd = pairs[0][1]; // last selected pair end
        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > chainEnd) { 
                chainLen++; // length of the chain
                chainEnd = pairs[i][1];
            }
        }
        System.out.println("Max length of the chain " + chainLen);
    }
}
