public class Problem2 {
    static int knapSack(int C, int[] wt, int[] p, int n){

        int[][] dp = new int[n+1][C+1];
        int i = 0, j=0;
        for(i = 0; i < n +1; i++){
            for(j = 0; j < C +1;j++){
                if( i== 0|| j==0){
                    dp[i][j] = 0;
                }
                else if( wt[i-1] > j){
                    dp[i][j] = dp[i-1][j];  //case0
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j - wt[i-1]] + p[i-1]);
                }

            }
        }
        return dp[n][C];


    }
    public static void main(String[] args){
        int C = 6;
        int[] wt = {1,2,3};
        int[] p = {10,15,40};
        int n = 3;
        int profit = knapSack(C,wt,p,n);
        System.out.println(profit);
    }


}
