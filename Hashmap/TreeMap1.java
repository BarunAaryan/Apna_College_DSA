import java.util.*;
public class TreeMap1 {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("China", 150);
        tm.put("US", 50);
        tm.put("Australia", 10);
        System.out.println(tm);
    }
}
