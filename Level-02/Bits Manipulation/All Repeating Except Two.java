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
   
//   Find xor of all array elements
    int xor=0;
    for(int i=0;i<arr.length;i++){
        xor^=arr[i];
    }
    
    
    int rsb=xor&(-xor);
    
    // Divide into two sets
    int n1=0;
    int n2=0;
    
    for(int i=0;i<arr.length;i++){
        if((arr[i]&rsb)==0){
            n1^=arr[i];
        }else{
            n2^=arr[i];
        }
    }
    if(n1<n2){
        System.out.println(n1);
        System.out.println(n2);
    }else {
        System.out.println(n2);
        System.out.println(n1);
    }
  }

}
