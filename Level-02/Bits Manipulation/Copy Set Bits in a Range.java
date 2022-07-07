import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();
    int l = scn.nextInt();
    int r = scn.nextInt();
    
    
    int mask= a & (((1<<(r-l+1))-1)<<(l-1));
    
    int ans=b|mask;
    
    
    System.out.println(ans);
    

   //write your code here
    
  }

}
