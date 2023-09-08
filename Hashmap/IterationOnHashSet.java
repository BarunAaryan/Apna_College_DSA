import java.util.*;

public class IterationOnHashSet {
    // Itertion on Hashset
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Kolkata");

        // using iterators
        Iterator it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println();
        // using enhanced for loop
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
