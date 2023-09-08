public class MethodOverloading {
    public static void main(String args[]) {
        Calculator calc= new Calculator();
        System.out.println(calc.sum(1,2));
        System.out.println(calc.sum(1,3, 4));
        System.out.println(calc.sum(1.4f,2.7f));
    }
}
class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}
