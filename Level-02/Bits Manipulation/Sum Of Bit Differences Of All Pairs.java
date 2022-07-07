import java.io.*;
import java.util.*;

public class Main {

  public static long solution(int[] arr){
    //write your code here
    long ans=0;
    
    for(int i=0;i<32;i++){
        long count1=0;
        long count0=0;
        
        for(int j=0;j<arr.length;j++){
            if(((arr[j])&(1<<i))!=0){
                count1++;
            }
            // else {
            //     count0++;
            // }
            
            
        }
        
        count0=arr.length-count1;
        
        long pairs=count1*count0*2;
        ans+=pairs;
    }
    
    return ans;
  }

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ; i < arr.length; i++){
      arr[i] = scn.nextInt();
    }
    System.out.println(solution(arr));
  }

}
