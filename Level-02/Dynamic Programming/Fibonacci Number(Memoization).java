class Solution {
    
    public int memo_fibo(int n,int dp[]){
        
        if(n<=1){
            return dp[n]=n;
        }
        
        if(dp[n]!=-1){
            return dp[n];
        }
        
        int ans=memo_fibo(n-1,dp)+memo_fibo(n-2,dp);
        return dp[n]=ans;
    }
    
  
    
    
    public int fib(int n) {
        
        
        int dp[]=new int[n+1];
        for(int i=0;i<=n;i++){
            dp[i]=-1;
        }
        
        
        int ans2=memo_fibo(n,dp);
        
        return ans2;
    }
}
