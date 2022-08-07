import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
      Scanner scn=new Scanner(System.in);
      
      String str=scn.next();
      
      int k=scn.nextInt();
      
      HashSet<Character> unique = new HashSet<>();
    String ustr = "";
    for (char ch : str.toCharArray()) {
      if (unique.contains(ch) == false) {
        unique.add(ch);
        ustr += ch;
      }
    }
     
     selection2(ustr,0,k,"",-1); 

  }
  
  public static void selection2(String ustr,int cs,int ts,String asf,int lcu){
      
      if(cs==ts){
          System.out.println(asf);
          return ;
      }
      
      for(int i=lcu+1;i<ustr.length();i++){
          char ch=ustr.charAt(i);
          selection2(ustr,cs+1,ts,asf+ch,i);
      }
      
  }

}
