import java.util.*;
public class array4 {
    //find the largest number , and smallest number
    public static int LargestNumber(int numbers[]){
        int largest = Integer.MIN_VALUE; //-infinity
        int smallest = Integer.MAX_VALUE; //-infinity
        for(int i=0; i<numbers.length; i++){
            if(largest<numbers[i]){
                largest = numbers[i];

            }
            if(smallest>numbers[i]){
                smallest= numbers[i];
            }
        }
        System.out.println("Smallest number is "+ smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[]= {1, 3, 8, 9, 45};
        System.out.println("largest value is "+ LargestNumber(numbers));
    }
}
