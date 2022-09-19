class Solution {
    
    public int helper(int n,int dp[]){
        
        if(n<=1){
            return dp[n]=1;
        }
        
        if(dp[n]!=-1){
            return dp[n];
        }
        
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=helper(i,dp)*helper(n-i-1,dp);
        }
        
        return dp[n]=ans;
    }
    
    public int numTrees(int n) {
        int dp[]=new int[n+1];
        
        Arrays.fill(dp,-1);
        
        return helper(n,dp);
    }
}
