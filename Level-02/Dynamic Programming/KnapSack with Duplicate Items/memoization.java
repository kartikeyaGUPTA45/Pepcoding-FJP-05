
class Solution{
    static int helper(int n,int W,int val[],int wt[],int dp[][]){
        if(n==0 || W==0){
            return 0;
        }
        if(dp[n][W]!=-1){
            return dp[n][W];
        }
        
        if(wt[n-1]<=W){
            int include=helper(n,W-wt[n-1],val,wt,dp)+val[n-1];
            int exclude=helper(n-1,W,val,wt,dp);
            
            return dp[n][W]=Math.max(include,exclude);
            
        }else {
            return dp[n][W]=helper(n-1,W,val,wt,dp);
        }
    }
    
    static int knapSack(int n, int W, int val[], int wt[])
    {
        // code here
        int dp[][]=new int[n+1][W+1];
        
        for(int a[]:dp){
            Arrays.fill(a,-1);
        }
        
        return helper(n,W,val,wt,dp);
        
    }
