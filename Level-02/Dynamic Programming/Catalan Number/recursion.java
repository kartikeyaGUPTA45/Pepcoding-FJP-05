import java.io.*;
import java.util.*;

public class Main{

public static int catalanNumber(int n){
    if(n<=1){
        return 1;
    }
    
    int ans=0;
    for(int i=0;i<n;i++){
       ans+=catalanNumber(i)*catalanNumber(n-i-1); 
    }
    
    return ans;
}

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    
    int ans=catalanNumber(n);
    
    System.out.println(ans);
 }

}
