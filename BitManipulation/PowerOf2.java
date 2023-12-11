public class PowerOf2 {
    //Check if a number is power of 2 or not
    public static boolean isPowerOfTwo(int n){
        return (n & (n-1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(8));
    }
}
