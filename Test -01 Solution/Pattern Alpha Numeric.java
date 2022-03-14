import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int count=0;
        char ch='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                char c=(char)(65+count);
                System.out.print(c +"\t"+ ++count+"\t");
            }
            System.out.println();
        }
      
    }
}
