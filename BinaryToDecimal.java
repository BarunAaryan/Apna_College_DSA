import java.util.*;
public class BinaryToDecimal {
    // convert the number from binary to decimal
    public static void binToDec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10; //to find the last digit
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10; //to remove the last digit
        }
        System.out.println("decimal of " + myNum + " is " + decNum);
    }

    public static void main(String[] args) {
        binToDec(101);
    }
}
