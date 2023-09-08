import java.util.*;

public class Valid_Parenthesis {
    public static boolean isValid(String str) { // o(n)=> the character is pushed once into te stack and removed once
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // opening
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);

            } else {
                // closing => "))))" => if only closing elements present
                if (s.isEmpty()) {
                    return false;
                }
                if ((s.peek() == '(' && ch == ')') // ()
                        || (s.peek() == '{' && ch == '}') // {}
                        || (s.peek() == '[' && ch == ']')) // []
                {
                    s.pop();
                } else {
                    return false;
                }

            }
        }
        if (s.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        String str = "({})[]"; // true
        System.out.println(isValid(str));
    }
}
