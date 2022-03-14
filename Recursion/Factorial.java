import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        int ans=factorial(n);

        System.out.println(ans);
    }

    public static int factorial(int n){
        // Base Condition
        if(n==0) {
            return 1;
        }

        // Faith
        int fac=factorial(n-1);

        // My work
        int ans=fac*n;
        return ans;


    }

}
