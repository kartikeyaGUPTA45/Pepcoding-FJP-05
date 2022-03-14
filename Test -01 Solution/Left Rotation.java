import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    
    for(int i=0;i<a.length;i++){
      System.out.print(a[i]+" ");
    }
  }
  public static void reverse(int[] a,int left,int right){
    
    while(left<right){
      int temp=a[left];
      a[left]=a[right];
      a[right]=temp;

      left++;
      right--;
    }
  }
  public static void rotate(int[] a, int d){
    // write your code here
    
    int n=a.length;
    d=n-d;
    d=d%n;
    if(d<0){
      d+=n;
    }
    reverse(a,0,n-1);
    reverse(a,0,d-1);
    reverse(a,d,n-1);
  }

public static void main(String[] args) throws Exception {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    
    int d = scn.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = scn.nextInt();
    }

    rotate(a, d);
    display(a);
 }

}
