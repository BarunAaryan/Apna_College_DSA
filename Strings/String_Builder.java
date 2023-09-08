import java.util.*;

public class String_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(""); // empty initialized
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        System.out.println(sb);
    }
}
//time complexity O(26)
//time complexity O(26* n^2) or O(n^2) - if we would have taken a string. because the string would be copied one by one 


