import java.util.*;

public class MinimumPartition {
    // Minimum Partioning
    //O(n+W)
    public static int minPartition(int arr[]) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        // W= sum/2
        int W = sum / 2;
        // weight = arr
        int dp[][] = new int[n + 1][W + 1];
        // Bottom up
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                if (arr[i - 1] <= j) {
                    // valid
                    dp[i][j] = Math.max(arr[i - 1] + dp[i - 1][j - arr[i - 1]], dp[i - 1][j]);
                    // dp[i-1][j] when we are excluding
                } else {
                    // invalid
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        int sum1= dp[n][W];
        int sum2= sum-sum1;
        return Math.abs(sum1-sum2);

    }

    public static void main(String[] args) {
        int nums[] = { 1, 6, 11, 5 };
        System.out.println(minPartition(nums));

    }
}