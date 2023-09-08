import java.util.*;

import javax.xml.transform.Source;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==2){
            System.out.println("n is a prime number");
        }else{
            boolean isPrime = true; //acts as tracker to check whether a number is prime or not
            for(int i=2; i<Math.sqrt(n); i++){
                if(n%i==0){
                    //n is a multiple of i( i is not equal to 1 or number itself)
                    isPrime = false;
                }
            }
            if(isPrime == true){
                System.out.println("N is a prime number");
            }else{
                System.out.println("N is a composite number");
            }
        }
        
    }
}
