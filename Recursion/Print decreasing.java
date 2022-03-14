import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        printDecreasing(n);

    }

    public static void printDecreasing(int n){
        // Base condition ->3
        if(n==0) {
            return ;
        }

        // My work ->2
        System.out.println(n);

        // faith ->1
        printDecreasing(n-1);
        
    }

}
