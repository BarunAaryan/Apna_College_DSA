import java.util.*;

public class LinkedHashSet1 {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Kolkata");
        System.out.println(cities);
        System.out.println();
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Kolkata");
        System.out.println(lhs);
        lhs.remove("Delhi");
        System.out.println(lhs);
    }
}
