class Solution {
    
    public int helper(String word1,String word2,int n,int m,int [][]dp){
        
        if(n==0) return m;
        if(m==0) return n;
        
        if(dp[n][m]!=-1) return dp[n][m];
        
        if(word1.charAt(n-1)==word2.charAt(m-1)){
            return dp[n][m]=helper(word1,word2,n-1,m-1,dp);
        }else {
            int ans1=helper(word1,word2,n,m-1,dp);
            int ans2=helper(word1,word2,n-1,m,dp);
            int ans3=helper(word1,word2,n-1,m-1,dp);
            
            return dp[n][m]=Math.min(Math.min(ans1,ans2),ans3)+1;
        }
    }
    
    public int minDistance(String word1, String word2) {
        int n=word1.length(),m=word2.length();
        
        int [][]dp=new int[n+1][m+1];
        
        for(int a[]:dp){
            Arrays.fill(a,-1);
        }
        
        return helper(word1,word2,n,m,dp);
        
    }
}
