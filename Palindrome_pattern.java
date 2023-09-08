public class Palindrome_pattern {
    // print a number palindrome pattern
    public static void PalindromePattern(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // dec
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // aec
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PalindromePattern(4);
    }
}
