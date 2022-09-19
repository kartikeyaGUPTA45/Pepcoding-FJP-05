import java.io.*;
import java.util.*;

public class Main{
    
    public static int catalan(int n,int dp[]){
        
        
        dp[0]=1;
        dp[1]=1;
        
        for(int i=2;i<=n;i++){
            for(int j=0;j<i;j++){
                dp[i]+=(dp[j]*dp[i-j-1]);
            }
        }
        
        
        return dp[n];
    }

public static void main(String[] args) throws Exception {
    // write your code her
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    
    int dp[]=new int[n+1];
    
    // Arrays.fill(dp,-1);
    
    int ans=catalan(n,dp);
    
    System.out.println(ans);
 }

}
