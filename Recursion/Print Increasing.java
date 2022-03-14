import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        printIncreasing(n);

    }

    public static void printIncreasing(int n){
        // Base Case
        if(n==0) {
            return ;
        }

        // Faith
        printIncreasing(n-1);

        // My work
        System.out.println(n);
        
    }

}
