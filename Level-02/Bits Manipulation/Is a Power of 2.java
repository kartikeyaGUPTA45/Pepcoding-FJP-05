import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    //write your code here
    
    int count=0;
    
    while(n!=0){
        int rsbm=~(n&(-n));
        count++;
        n=n&rsbm;
    }
    
    if(count==1){
        System.out.println("true");
    }else {
        System.out.println("false");
    }
    
  }

}
