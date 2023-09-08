public class Diamond_pattern {
    public static void diamondpat(int n) {
        //1st half
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            // spaces
            for (int j=1;j <=(n-i); j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <=(2*i)- 1; j++) { // ek line hai to ek star print ho , do line hai to do star print
            // ho
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        // outer loop
        for (int i = n; i >= 1; i--) {
            // inner loop
            // spaces
            for (int j=1;j <=(n-i); j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <=(2*i)- 1; j++) { // ek line hai to ek star print ho , do line hai to do star print
            // ho
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        diamondpat(5);
    }
}
