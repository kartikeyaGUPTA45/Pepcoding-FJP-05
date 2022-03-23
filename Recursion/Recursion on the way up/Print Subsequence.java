import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();

        printSS(str,"");

    }

    public static void printSS(String str, String asf) {
        if(str.length()==0){
            System.out.println(asf);
            return ;
        }


        char ch=str.charAt(0);
        String ros=str.substring(1);
        // Include
        printSS(ros,asf+ch);

        // Exclude
        printSS(ros,asf);

        
    }

}
