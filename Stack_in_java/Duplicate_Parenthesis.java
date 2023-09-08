import java.util.*;

public class Duplicate_Parenthesis {

    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
                // closing
                if (ch == ')') { //O(n)
                    int count = 0;
                    while (s.peek() != '(') {
                        // !s.isEmpty() && //as it is a valid string , stack kabhi khali hoga hi nahi
                        s.pop();
                        count++;
                    }
                    if (count < 1) {
                        return true;// duplicate exists
                    } else {
                        s.pop(); // duplicate does not exist, opening pair
                    }
                }else{
                    // opening, operator , operand
                    s.push(ch);
                }
        }
        return false;
    }
    public static void main(String[] args) {
        // valid string
        String str = "((a+b))"; // true
        String str2 = "((a+b))"; // false
        System.out.println(isDuplicate(str));

    }
}
