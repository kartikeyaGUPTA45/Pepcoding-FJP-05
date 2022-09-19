class Solution {
    public int minInsertions(String s) {
        int n=s.length();
        
        int dp[][]=new int[n+1][n+1];
        
        String reverse="";
        for(int i=n-1;i>=0;i--){
            reverse+=s.charAt(i);
        }
        
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(s.charAt(i-1)==reverse.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        
        return n-dp[n][n];
    }
}
