import java.util.*;
public class PrintNumb {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int range = sc.nextInt();
    int counter= 1;

    while (counter<= range){
        System.out.print(counter + " ");
        counter++;
    }
    System.out.println();
    
}
}
