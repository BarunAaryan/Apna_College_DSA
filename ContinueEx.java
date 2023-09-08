import java.util.*;
public class ContinueEx {
    //Display all numbers entered by user except multiples of 10
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter your number");
        int n = sc.nextInt();
        if( n %10==0){
            continue;
        }
        System.out.println("The number entered was " + n);
        }while(true);

    }
}
