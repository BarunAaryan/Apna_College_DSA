public class Star {
    //print star pattern
    public static void main(String[] args) {
        for(int line=1; line <=4; line++){
            for(int star=1; star <=line; star++){
                System.out.print("*");
            }
            System.out.println(); //ek line ke sare stars print ho gaye so next line
        }
    }
}
