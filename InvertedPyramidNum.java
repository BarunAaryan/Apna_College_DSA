public class InvertedPyramidNum {
    // print an inverted pyramid with numbers

    public static void InvPyrNum(int n) {
        for (int i = 1; i <= n; i++) {
            // inner loop for the numbers
            for (int j = 1; j <= n - i +1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
        public static void main(String[] args) {
        InvPyrNum(8);
    }
}
