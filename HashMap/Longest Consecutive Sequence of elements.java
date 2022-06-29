import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    HashMap<Integer,Boolean>map=new HashMap<>();
    
    int n=scn.nextInt();
    
    int []arr=new int [n];
    
    // Consider all elements as a Sp 
    for(int i=0;i<n;i++){
        arr[i]=scn.nextInt();
        map.put(arr[i],true);
    }
    
    // Discard invalid Sp
    for(int i=0;i<n;i++){
        if(map.containsKey(arr[i]-1)==true){
            map.put(arr[i],false);
        }
    }
    
    // Find longest sequence
    
    int sp=0;
    int maxlength=0;
    
    for(int i=0;i<n;i++){
        if(map.get(arr[i])==true){
            int curr=arr[i];
            int len=1;
            while(map.containsKey(curr+1)==true){
                curr+=1;
                len++;
            }
            if(len>maxlength){
                maxlength=len;
                sp=arr[i];
            }
        }
    }
    
    for(int i=0;i<maxlength;i++){
        System.out.println(sp+i);
    } 
    
 }

}
