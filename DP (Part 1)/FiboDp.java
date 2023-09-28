public class FiboDp {
    public static int fib(int n , int f[]){ //O(n)
        if(n==0 || n==1){
            return n;
        }
        if(f[n] !=0){ // fib(n) already calculated
            return f[n];
        }
        f[n] = fib(n-1, f) + fib(n-2, f);
        return f[n];
    }
    public static void main(String[] args) {
        int n=5;
        //beacuse we calculate fibo from 0 to n so 
        //fib(n) will be fib of nth number so n+1
        int f[] = new int [n+1]; // 0 0 0 0 
        System.out.println(fib(n, f));
    }
    
}
