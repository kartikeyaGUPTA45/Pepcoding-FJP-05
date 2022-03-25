import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        printEncodings(str,"");

    }

    public static void printEncodings(String str,String asf) {
      

        // Step-08
        if(str.length()==0){
            System.out.println(asf);
            return ;
        }

        // Step-01
        String ch0=str.substring(0,1);
        // Step-02
        String ros=str.substring(1);
        // Step-03
        if(ch0.equals("0")) return ;

        printEncodings(ros,asf+(char)(Integer.parseInt(ch0)-1+'a'));

        // Step-04
        if(str.length()>=2){
            // Step-05
            String ch01=str.substring(0,2);

            //step-06
            String ros2=str.substring(2);

            //step -07
            if(Integer.parseInt(ch01)<=26){
                printEncodings(ros2,asf+(char)(Integer.parseInt(ch01)-1+'a'));
            }


        }



    }

}
