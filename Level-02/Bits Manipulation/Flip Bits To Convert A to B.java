import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();

    //write your code here
    int n=a^b;
    
    int count=0;
    while(n!=0){
        int rsbm=~(n&(-n));
        count++;
        n=n&rsbm;
    }
    
    
    System.out.println(count);
  }

}
