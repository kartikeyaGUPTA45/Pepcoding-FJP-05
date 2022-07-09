import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    boolean flag=false;
    int reverseAns=0;
    int j=0;
    //write your code here
    for(int i=31;i>=0;i--){
        int mask=1<<i;
        if(flag==true){
            if((n&mask)!=0){
                System.out.print(1);
                int submask=(1<<j);
                reverseAns|=submask;
            }else{
                System.out.print(0);
            }
            j++;
            
        }else {
            if((n&mask)!=0){
                System.out.print(1);
                int submask=(1<<j);
                reverseAns|=submask;
                j++;
                flag=true;
            }
        }
    }
    System.out.println();
    System.out.println(reverseAns);
  }

}
