

//User function Template for Java

class Solution{
    static int matrixMultiplication(int N, int arr[])
    {
        
        int[][]dp = new int[N-1][N-1];
        
        for(int g = 0; g < dp.length ; g++){
            
            for(int i = 0 , j= g ; j < dp.length; i++ , j++){
                
                if(g == 0)
                dp[i][j] = 0;
                else if(g == 1)
                  dp[i][j] = arr[j-1]*arr[j] * arr[j+1];
                else{
                    int min = Integer.MAX_VALUE;
                    for(int k1 = 1 , k2 = g ; k1 <= g && k2 >= 1 ; k1++,k2--){
                        int left = dp[i][j-k2];  // arr[i] * arr[j-k2+1];
                        int right = dp[i+k1][j];  // arr[i+k1] * arr[j+1];
                        int mul = arr[i] * arr[i+k1] * arr[j+1];
                        
                        min = Math.min(min , left + right +mul);
                    }
                    
                    dp[i][j] = min;
                }
                
                
            }
            
        }
        
        
       return dp[0][dp[0].length-1];
        
    }
}
