import java.util.*;

public class Hashmap_Operation {
    //Hashmap opeartion
    public static void main(String[] args) {
        //Create
        HashMap<String , Integer> hm = new HashMap<>();
        //insert - 0(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        System.out.println(hm);

        //get - 0(1)
        int population =hm.get("India");
        System.out.println(population);

        System.out.println(hm.get("Indonesia")); //null return

        //contains key = 0(1)
        //checks if a key is present or not
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));

        //remove - 0(1)
        System.out.println(hm.remove("China"));
        System.out.println(hm);

        //print size
        System.out.println("Size is"+hm.size());

        //is Empty
        System.out.println(hm.isEmpty()); 
        //as map is not empty so returned false

        hm.clear(); // hasmap clears out
    }
}
