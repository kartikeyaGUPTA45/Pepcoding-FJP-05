

//User function Template for Java

class Solution{
    
    static int helper(int arr[],int i,int j){
        if(i>=j) return 0;
        
        int ans=Integer.MAX_VALUE;
        
        for(int k=i;k<j;k++){
            int subAns=helper(arr,i,k)+helper(arr,k+1,j)+(arr[i-1]*arr[k]*arr[j]);
            
            if(ans>subAns){
                ans=subAns;
            }
            
        }
        
        return ans;
    }
    
    
    static int matrixMultiplication(int N, int arr[])
    {
        // code here
        return helper(arr,1,N-1);
    }
}
