import java.util.*;
public class HashSet1 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(1);
        System.out.println(set);
        System.out.println(set.size());
        if (set.contains(2)) {
            System.out.println("Set Contains 2");
        }
        if (set.contains(3)) {
            System.out.println("Set Contains 3");
        }

        set.remove(2);
        if (set.contains(2)) {
            System.out.println("Set Contains 2");
        }
        set.clear();
        System.out.println(set.size());
        System.out.println(set.isEmpty());
    }
}
