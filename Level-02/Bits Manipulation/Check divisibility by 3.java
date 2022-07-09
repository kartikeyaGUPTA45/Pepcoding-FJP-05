import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();

    //write your code here
    int even_sum=0;
    int odd_sum=0;
    
    for(int i=0;i<str.length();i++){
        if(i%2==0){
            even_sum+=(str.charAt(i)-'0');
        }else {
            odd_sum+=(str.charAt(i)-'0');
        }
    }
    
    int diff=even_sum-odd_sum;
    
    if(diff%11==0){
        System.out.println("true");
    }else {
        System.out.println("false");
    }
  }

}
