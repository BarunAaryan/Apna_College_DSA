import java.util.*;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) { //if length are not same then directly return false
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        // loop at s
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(s.charAt(i), 0) + 1);
        }
        // loop at t
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (map.get(ch) != null) {
                if (map.get(ch) == 1) {
                    map.remove(ch);

                } else {
                    map.put(ch, map.get(ch) - 1); // decrease the frequency by 1
                }
            } else {
                return false; // t has a character which does not exist inside s
            }
        }
        return map.isEmpty();
    }

    public static void main(String[] args) {
        String s = "race"; // O(n) where n is the length of s and t
        String t = "care";
        System.out.println(isAnagram(s, t));
    }
}
