

//User function Template for Java

class Solution{
    static boolean ispalindrome(String s,int i,int j)
    {
        // int n=s.length();
        // int i=0;
        // int j=n-1;
        while(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    static int palindromicPartition(String str)
    {
        // code here
        int n=str.length();
        int dp[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            dp[i][i]=0;
        }
        for(int gap=1;gap<n;gap++)
        {
            for(int i=0;i+gap<n;i++)
            {
                int j=i+gap;
                if(ispalindrome(str,i,j))
                {
                    dp[i][j]=0;
                }
                else
                {
                    dp[i][j]=Integer.MAX_VALUE;
                    for(int k=i;k<j;k++)
                    {
                        dp[i][j]=Math.min(dp[i][j],1+dp[i][k]+dp[k+1][j]);
                    }
                }
            }
        }
        return dp[0][n-1];
    }
}
