import java.util.*;
public class Iteration_hashmap {
    //Iteration in Hashmap
    public static void main(String[] args) {
        HashMap<String, Integer> hm= new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Nepal", 250);
        hm.put("Indonesia", 270);

        //Iterate 
        //entry set in hashmap hm.entrySet()
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k: keys) { //for each loop
            System.out.println("Key= "+k+ ", Value= "+ hm.get(k));
            
        }
    }
}
