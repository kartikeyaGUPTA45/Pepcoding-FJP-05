class Solution{
    static int knapSack(int n, int W, int val[], int wt[])
    {
        // code here
        if(n==0 || W==0){
            return 0;
        }
        
        
        if(wt[n-1]<=W){
            int include=knapSack(n,W-wt[n-1],val,wt)+val[n-1];
            int exclude=knapSack(n-1,W,val,wt);
            
            return Math.max(include,exclude);
            
        }else {
            return knapSack(n-1,W,val,wt);
        }
    }
