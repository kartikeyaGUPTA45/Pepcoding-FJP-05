class Solution {
    
    public int helper(String w1,String w2,int n,int m,int dp[][]){
        if(n==0){
            return dp[n][m]=m;
        }
        
        if(m==0){
            return dp[n][m]=n;
        }
        
        if(dp[n][m]!=-1){
            return dp[n][m];
        }
        if(w1.charAt(n-1)==w2.charAt(m-1)){
            return dp[n][m]=helper(w1,w2,n-1,m-1,dp);
        }else {
            int insert=helper(w1,w2,n,m-1,dp);
            int delete=helper(w1,w2,n-1,m,dp);
            int replace=helper(w1,w2,n-1,m-1,dp);
            
            int ans=Math.min(insert,Math.min(delete,replace));
            
            return dp[n][m]=ans+1;
            
        }
    }
    
    
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        
        int dp[][]=new int[n+1][m+1];
        
        for(int a[]:dp){
            Arrays.fill(a,-1);
        }
        
        return helper(word1,word2,n,m,dp);
        
    }
}
