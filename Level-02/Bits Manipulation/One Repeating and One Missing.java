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
   int xor = 0;
   for(int i = 0 ; i < arr.length; i++){
       xor ^= arr[i];
       xor ^= (i + 1);
   }
   int rsbmask = xor & (-xor);
   int x = 0;
   int y  = 0;
   for(int i = 0 ; i < arr.length; i++){
       if((rsbmask & arr[i]) == 0){
           x ^= arr[i];
       }else{
           y ^= arr[i];
       }
   }
   
   for(int i = 1 ; i <= arr.length; i++){
       if((rsbmask & i) == 0){
           x ^= i;
       }else{
           y ^= i;
       }
   }
   
   for(int i = 0 ; i < arr.length; i++){
       if(arr[i] == x){
           System.out.println("Missing Number -> " + y);
           System.out.println("Repeating Number -> " + x);
           break;
       }
       
       if(arr[i] == y){
           System.out.println("Missing Number -> " + x);
           System.out.println("Repeating Number -> " + y);
           break;
       }
   }
   
   
   
  }

}


                        
                        
