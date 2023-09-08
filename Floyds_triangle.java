public class Floyds_triangle {
    public static void FloydsTri(int n){
        //outer
        int counter =1;
        for(int i=1; i<=n; i++){
            //inner - how many times will the counter be printed
            for(int j=1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        FloydsTri(5);
    }
}
