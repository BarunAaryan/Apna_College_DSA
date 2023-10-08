public class LCSMemo {
    public static int lcsmemoization(String str1, String str2, int n, int m, int dp[][]) {
        if (n == 0 || m == 0) {
            return 0;
        }
        //check

        if(dp[n][m]!=-1){//answer is already calculated
            return dp[n][m];
        }
        if (str1.charAt(n - 1) == str2.charAt(m - 1)) {
            return dp[n][m]=lcsmemoization(str1, str2, n - 1, m - 1, dp) + 1;
        } else { // different
            int ans1 = lcsmemoization(str1, str2, n - 1, m,dp);
            int ans2 = lcsmemoization(str1, str2, n, m - 1,dp);
            return dp[n][m]= Math.max(ans1, ans2);
        }

    }

    public static void main(String[] args) {
        String str1 = "abcdge";
        String str2 = "abedg";
        // lcs-> abdg, length-4
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n + 1][m + 1];
        //initialisation
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println(lcsmemoization(str1, str2, n, m, dp));
    }
}
