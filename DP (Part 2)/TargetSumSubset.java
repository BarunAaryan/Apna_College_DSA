public class TargetSumSubset {
    public static void print(boolean dp[][]){
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }
    //O(n+sum)
    public static boolean targetsum(int arr[], int sum) {
        int n = arr.length;
        boolean dp[][] = new boolean[n + 1][sum + 1];
        //i = items ; and j = sum
        for(int i=0; i<n+1; i++){
            dp[i][0]= true;
        }
        for(int i=1; i<n+1; i++){
            for(int j=1; j<sum+1; j++){
                //include
                int v= arr[i-1];
                if(v<= j && dp[i-1][j-v] == true){
                    dp[i][j]= true;
                }
                //exclude
                else if(dp[i-1][j]== true){
                    dp[i][j] = true;
                }
            }
        }
        print(dp);
        return dp[n][sum];

    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 1, 7, 3 };
        int sum = 10;
        System.out.println(targetsum(arr, sum));
    }
}
