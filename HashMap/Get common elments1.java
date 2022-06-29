import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int n1=scn.nextInt();
    int a1[]=new int[n1];
    
    for(int i=0;i<n1;i++){
        a1[i]=scn.nextInt();
    }
    
    int n2=scn.nextInt();
    int a2[]=new int[n2];
    
    for(int i=0;i<n2;i++){
        a2[i]=scn.nextInt();
    }
    
    // Creating HashSet -> store only unique keys
    HashSet<Integer>set=new HashSet<>();
    
    // add all a1 array unique values in set
    for(int i=0;i<n1;i++){
        set.add(a1[i]);
    }
    
    // Print common values present in a2
    for(int i=0;i<n2;i++){
        if(set.contains(a2[i])==true){
            System.out.println(a2[i]);
            set.remove(a2[i]);
        }
    }
    
 }

}
