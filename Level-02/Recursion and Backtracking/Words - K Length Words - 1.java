import java.io.*;
import java.util.*;

public class Main {

 

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int k = Integer.parseInt(br.readLine());

    HashSet<Character> unique = new HashSet<>();
    String ustr = "";
    for (char ch : str.toCharArray()) {
      if (unique.contains(ch) == false) {
        unique.add(ch);
        ustr += ch;
      }
    }
    
    boolean used[]= new boolean [ustr.length()];
    
    words1(ustr,0,new Character[k],0,k);
    
  }
  
  
  public static void words1(String ustr,int cc,Character[]spots,int ssf,int ts){
      
      if(cc==ustr.length()){
          if(ssf==ts){
              for(int i=0;i<spots.length;i++){
                  System.out.print(spots[i]);
              }
              System.out.println();
          }
          
        //   System.out.println();
          return ;
      }
      
      
      // YES
      for(int i=0;i<spots.length;i++){
          if(spots[i]==null){
              spots[i]=ustr.charAt(cc);
              words1(ustr,cc+1,spots,ssf+1,ts);
              spots[i]=null;
          }
      }
      
      //No 
      
      words1(ustr,cc+1,spots,ssf,ts);
      
  }

}
