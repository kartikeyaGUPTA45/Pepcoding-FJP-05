import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int pivot=sc.nextInt();
        
        int[] result= partition(arr,pivot);
        
        for(int i:result){
            System.out.print(i+"\t");
        }
        
    }
    
    public static int[] partition(int[] arr,int pivot){
        int[] result=new int[arr.length];
        int start=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<pivot){
                result[start++]=arr[i];
            }           
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==pivot){
                result[start++]=arr[i];
            }           
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>pivot){
                result[start++]=arr[i];
            }           
        }
        
        
        
        return result;
    }
}
