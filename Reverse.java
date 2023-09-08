public class Reverse {
    public static void main(String[] args) {
        //print the reverse of a number
        int n = 10989;
        while(n>0){
            int lastDigit = n%10;
            System.out.print(lastDigit + " ");
            n= n/10; //n/=10

        }
        System.out.println();
    }
    
}
