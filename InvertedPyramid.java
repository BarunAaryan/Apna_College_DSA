class InvertedPyramid {
    // print inverted and rotated half pyramid -Advanved patterns
    public static void InvertedRotate(int n) {
        // n represents the number of lines
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= i; j++) { // ek line hai to ek star print ho , do line hai to do star print ho

                System.out.print("*");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        InvertedRotate(5);
    }
}