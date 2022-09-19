 static int knapSack(int n, int W, int val[], int wt[])
    {
        // code here
        int dp[][]=new int[n+1][W+1];
        
        for(int a[]:dp){
            Arrays.fill(a,0);
        }
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=W;j++){
                if(wt[i-1]<=j){
                    int include=dp[i][j-wt[i-1]]+val[i-1];
                    int exclude=dp[i-1][j];
                    
                    dp[i][j]=Math.max(include,exclude);
                }else {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        
        return dp[n][W];
        
    }
}
