import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class AreaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        float r = sc.nextFloat();
        System.out.println("Area of the circle");
        float area = 3.14f * r* r;
        System.out.println(area);


    }
    
    
}
