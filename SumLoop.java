import java.util.Scanner;
public class SumLoop {
    public static void main(String[] args) {
        //sum of 1st n natural numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum=0;
        int i=1; //iterator or counter
        while(i<=n){
            sum += i;
            i++;

        }
        System.out.println("sum is " + sum);

    }
}
