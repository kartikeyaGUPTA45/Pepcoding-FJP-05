import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    
    Scanner scn=new Scanner(System.in);
    int n1=scn.nextInt();
    int a1[]=new int [n1];
    
    for(int i=0;i<n1;i++){
        a1[i]=scn.nextInt();
    }
    
    
    int n2=scn.nextInt();
    int a2[]=new int [n2];
    
    for(int i=0;i<n2;i++){
        a2[i]=scn.nextInt();
    }
    
    
    
    HashMap<Integer,Integer>map=new HashMap<>();
    
    for(int i=0;i<n1;i++){
        if(map.containsKey(a1[i])==true){
            int freq=map.get(a1[i]);
            freq+=1;
            map.put(a1[i],freq);
            
        }else{
            map.put(a1[i],1);
        }
    }
    
    
    for(int i=0;i<n2;i++){
        if(map.containsKey(a2[i])==true){
            System.out.println(a2[i]);
            int freq=map.get(a2[i]);
            freq-=1;
             if(freq==0){
                 map.remove(a2[i]);
            }else{
                map.put(a2[i],freq);
             }`
        }
    }
    
   
    
 }

}
