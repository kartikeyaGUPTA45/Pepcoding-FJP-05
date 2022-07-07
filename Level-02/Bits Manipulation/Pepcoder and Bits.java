import java.io.*;
import java.util.*;

public class Main {
    public static long ncr(long n, long r){
        if(n < r){
            return 0L;    
        }
        
        long res = 1L;
        
        for(long i = 0L; i < r; i++){
            res = res * (n - i);
            res = res / (i + 1);
        }
        
        return res;
    }
    
    public static long solution(long n) {
        int count=csb(n);
       long ans=0;
        for(int i=63;i>=0;i--){
            long mask=1L<<i;
            // long mask=(long)1<<i;
            if((n&mask)!=0 && count>0){
                ans+=ncr(i,count);
                count--;
            }
            
        }
        
        return ans;
      
    }
    
    public static int csb(long n){
        int res = 0;
        
        while(n > 0){
            long rsb = n & -n;
            n -= rsb;
            res++;
        }
        
        return res;
    }
    
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        int k = csb(n);
        System.out.println(solution(n));
    }
	
	
}
