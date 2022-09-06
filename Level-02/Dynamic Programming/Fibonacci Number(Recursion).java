class Solution {
    
    public int helper(int n){
        
        if(n<=1){
            return n;
        }
        
        int ans=helper(n-1)+helper(n-2);
        return ans;
    }
    
    
    public int fib(int n) {
        int ans=helper(n);
        
        return ans;
    }
}
