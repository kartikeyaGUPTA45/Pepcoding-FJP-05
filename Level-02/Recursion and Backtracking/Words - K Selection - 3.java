import java.io.*;
import java.util.*;

public class Main {

  
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int k = Integer.parseInt(br.readLine());

    HashMap<Character, Integer> unique = new HashMap<>();
    String ustr = "";
    for (char ch : str.toCharArray()) {
      if (unique.containsKey(ch) == false) {
        unique.put(ch, 1);
        ustr += ch;
      } else {
        unique.put(ch, unique.get(ch) + 1);
      }
    }
    
    selection3(ustr,unique,0,0,k,"");
   
  }
  
  public static void selection3(String ustr,HashMap<Character,Integer>unique,int cc,int ssf,int ts,String asf){
      
      if(ssf>ts) return;
      
      if(cc==ustr.length()){
          if(ssf==ts){
              System.out.println(asf);
          }
          
          return ;
      }
      
      
      char ch=ustr.charAt(cc);
      int freq=unique.get(ch);
      
    //   Yes
    for(int i=freq;i>=0;i--){
        String substr="";
        
        for(int j=0;j<i;j++){
            substr+=ch;
        }
        
        selection3(ustr,unique,cc+1,ssf+i,ts,asf+substr);
    }
      
     // No
     
    //  selection3(ustr,unique,cc+1,ssf,ts,asf);
      
  }

}
