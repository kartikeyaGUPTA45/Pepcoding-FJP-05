import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        ArrayList<String>ans=getStairPaths(n);

        System.out.println(ans);


    }

    public static ArrayList<String> getStairPaths(int n) {

        //Positive Base Case
        if(n==0){
            ArrayList<String>base1=new ArrayList<>();
            base1.add("");
            return base1;
        }

        // Negative Base Case
        if(n<0){
            ArrayList<String> base2 = new ArrayList<>();
            return base2;
       }
    
        // Faith -01 for 1 step
        ArrayList<String>rr1=getStairPaths(n-1);
         // Faith -02 for 2 steps
        ArrayList<String>rr2=getStairPaths(n-2);
         // Faith -03 for 3 steps
        ArrayList<String>rr3=getStairPaths(n-3);

        // My Work
        ArrayList<String>myAns=new ArrayList<>();

        for(int i=0;i<rr1.size();i++){
            myAns.add("1"+rr1.get(i));
        }

        for(int i=0;i<rr2.size();i++){
            myAns.add("2"+rr2.get(i));
        }

        for(int i=0;i<rr3.size();i++){
            myAns.add("3"+rr3.get(i));
        }

        return myAns;


    }

}
