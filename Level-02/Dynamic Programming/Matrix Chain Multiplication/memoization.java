

//User function Template for Java

class Solution{
    
    static int helper(int arr[],int i,int j,int [][]dp){
        if(i>=j) return 0;
        
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        
        int ans=Integer.MAX_VALUE;
        
        for(int k=i;k<j;k++){
            int subAns=helper(arr,i,k,dp)+helper(arr,k+1,j,dp)+(arr[i-1]*arr[k]*arr[j]);
            
            if(ans>subAns){
                ans=subAns;
            }
            
        }
        
        return dp[i][j]= ans;
    }
    
    
    static int matrixMultiplication(int N, int arr[])
    {
        // code here
        int dp[][]=new int[N+1][N+1];
        for(int a[]:dp){
            Arrays.fill(a,-1);
        }
        
        return helper(arr,1,N-1,dp);
    }
}
