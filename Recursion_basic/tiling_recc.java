public class tiling_recc {
    public static int tilingProblem(int n){//2 x n (floor size)
//n = length of the tile
//base case
if(n==0 || n==1){
    return 1;
}
//kaam
//vertical choice
int fnm1 = tilingProblem(n-1);
//fnm = fn -1
//horizontal choice
int fnm2 = tilingProblem(n-2);
int totWays = fnm1 + fnm2;
return totWays;
    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(3));
    }
}
