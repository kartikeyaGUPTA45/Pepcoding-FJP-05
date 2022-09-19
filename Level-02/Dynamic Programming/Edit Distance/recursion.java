class Solution {
    
    public int helper(String word1,String word2,int n,int m){
        
        if(n==0) return m;
        if(m==0) return n;
        
        if(word1.charAt(n-1)==word2.charAt(m-1)){
            return helper(word1,word2,n-1,m-1);
        }else {
            int ans1=helper(word1,word2,n,m-1);
            int ans2=helper(word1,word2,n-1,m);
            int ans3=helper(word1,word2,n-1,m-1);
            
            return Math.min(Math.min(ans1,ans2),ans3)+1;
        }
    }
    
    public int minDistance(String word1, String word2) {
        int n=word1.length(),m=word2.length();
        
        
        
        return helper(word1,word2,n,m);
        
    }
}
