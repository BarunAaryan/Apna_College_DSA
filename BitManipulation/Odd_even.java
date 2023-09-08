public class Odd_even {
    // check if a number is odd or even
    public static void oddOrEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            // even number
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }

    public static void main(String[] args) {
        oddOrEven(3);
        oddOrEven(24);
        oddOrEven(12);
        oddOrEven(11);
    }
}
