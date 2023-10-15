import java.util.*;

public class CatlanMemoi {
    // Catlan Memoization
    public static int CatlanMemo(int n, int dp[]) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if(dp[n] != -1) {
            return dp[n];
        }
        int ans =0;
        for(int i=0; i<n; i++){
            ans+= CatlanMemo(i, dp) *CatlanMemo(n-i-1, dp);
        }
        return dp[n] = ans;
    }

    public static void main(String[] args) {
        int n = 4;
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1); // fills the array with -1
        System.out.println(CatlanMemo(n, dp));

    }
}
