public class Number_Pyramid {
    public static void numberPyramid(int n){
        for(int i=1; i<=5; i++){
            //spaces
            for(int j=1; j<=5-i; j++){
                System.out.print(" ");
            }
            //numbers 
            for(int j=1; j<=i; j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
        numberPyramid(n);
    }
}
