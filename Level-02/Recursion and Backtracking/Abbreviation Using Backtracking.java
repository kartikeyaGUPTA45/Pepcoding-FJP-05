import java.io.*;
import java.util.*;

public class Main {

    public static void solution(String str, String asf,int count, int idx){
        //write your code here
        if(idx==str.length()){
            if(count>0){
                System.out.println(asf+count);
            }else {
                System.out.println(asf);
            }
            
            return ;
        }
        
        
        //YES
        char ch=str.charAt(idx);
        if(count>0){
            solution(str,asf+count+ch,0,idx+1);
        }else {
            solution(str,asf+ch,0,idx+1);
        }
        
        // solution(str,asf+(count>0?count:"")+ch,0,idx+1);
        
        solution(str,asf,count+1,idx+1);
        
    }
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        solution(str,"",0,0);
    }
    
    
}
