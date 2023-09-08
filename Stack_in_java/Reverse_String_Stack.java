import java.util.*;

public class Reverse_String_Stack {
    // reverse a String using a stack
    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        // inserting into the stack
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }
        // removing from the stack
        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();

    }

    public static void main(String[] args) {
        String str = "abc";
        String result = reverseString(str);
        System.out.print(result);

    }
}
