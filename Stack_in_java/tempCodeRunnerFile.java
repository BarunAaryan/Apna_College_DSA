import java.util.*;

public class Stock_Span {
    // Stock Span Problem
    public static void stockSpan(int stocks[], int span[]) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        // calculate span
        for (int i = 1; i < stocks.length; i++) {
            //loop to check; today's span
            int currPrice = stocks[i];
            while (!s.isEmpty() && currPrice > stocks[s.peek()]) {
                //stocks[s.peak()]=> top of stack
                s.pop(); // chote element ko nikalna
            }
            if (s.isEmpty()) {
                span[i] = i + 1; // if span khali ho jaye nikalte nikalte
            } else {
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }
            s.push(i);
        }
    }

    public static void main(String[] args) {
        int stocks[] = { 100, 80, 60, 70, 60,  85, 100 };
        int span[] = new int[stocks.length];
        stockSpan(stocks, span);
        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i] + " ");

        }
    }
}
