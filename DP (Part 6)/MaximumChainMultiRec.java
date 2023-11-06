import java.util.*;
//maximum Chain multiplication recursion
public class MaximumChainMultiRec {
    public static int mcm(int arr[], int i, int j) {
        if (i == j) {
            return 0; // single matrix
        }
        int ans = Integer.MAX_VALUE;
        for (int k = i; k <= j - 1; k++) {
            int cost1 = mcm(arr, i, k); // Ai to Ak=> size ar[i-1] x arr[k]
            int cost2 = mcm(arr, k + 1, j); // Ai+1..Aj=. size arr[k] x arr[j]
            int cost3 = arr[i - 1] * arr[k] * arr[j];
            int finalCost = cost1 + cost2 + cost3;
            ans = Math.min(ans, finalCost);
        }
        return ans; // Min Cost
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 3 }; // n=5
        int n = arr.length;
        System.out.println(mcm(arr, 1, n - 1));
    }
}
