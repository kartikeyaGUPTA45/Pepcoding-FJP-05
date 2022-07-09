import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    System.out.println(solution(n));
  }

  public static int solution(int n){
    //write your code here
    if(n==0){
        return 0;
    }
    
    int x=nearestPowerOf2(n);
    int ans1=(1<<(x-1))*x;
    int ans2=n-(1<<x)+1;
    int restans=n-(1<<x);
    int ans3=solution(restans);
    
    int finalAns=ans1+ans2+ans3;
    return finalAns;
  }
  
  public static int nearestPowerOf2(int n){
      int i=0;
      
      while((1<<i)<=n){
          i++;
      }
      return i-1;
      
  }

}
