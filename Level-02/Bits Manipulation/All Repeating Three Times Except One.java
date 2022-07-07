import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ; i < n; i++){
      arr[i] = scn.nextInt();
    }
    solution(arr);
  }

  public static void solution(int[] arr){
   //write your code here
   int ans=0;
   for(int i=0;i<32;i++){
       int sum=0;
       for(int j=0;j<arr.length;j++){
           if((arr[j]&(1<<i))!=0){
               sum++;
           }
       }
       if(sum%3!=0){
           ans|=(1<<i);
       }
   }
   
   
   
   System.out.println(ans);
   
  }

}
