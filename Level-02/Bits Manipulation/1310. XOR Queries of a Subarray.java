class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n=arr.length;
        int prefix[]=new int[n];
        int size=queries.length;
        
        int answer[]=new int[size];
        
        prefix[0]=arr[0];
        
//         Making prefix Array
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]^arr[i];
        }
        
        for(int i=0;i<size;i++){
            int left=queries[i][0];
            int right=queries[i][1];
            
            if(left==0) answer[i]=prefix[right];
            else {
                answer[i]=prefix[right]^prefix[left-1];
            }
        }
        
        
        
        
        return answer;
        
    }
}
