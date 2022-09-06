class Solution {
  
    
    public int tab_fibo(int n,int []dp){
        
        if(n<=1){
            return n;
        }
        
        dp[0]=0;
        dp[1]=1;
        
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        
        return dp[n];
        
    }
    
    public int fib(int n) {
        
        int dp[]=new int[n+1];
        for(int i=0;i<=n;i++){
            dp[i]=-1;
        }
        
        
        int ans3=tab_fibo(n,dp);
        
        return ans3;
    }
}
