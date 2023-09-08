import java.util.*;
public class TreeSet1 {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Kolkata");
        System.out.println(cities);

        TreeSet<String> ts= new TreeSet<>();
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("Kolkata");
        System.out.println(ts);
    }
}
