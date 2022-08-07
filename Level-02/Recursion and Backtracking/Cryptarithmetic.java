import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String s1 = scn.nextLine();
    String s2 = scn.nextLine();
    String s3 = scn.nextLine();

    HashMap<Character, Integer> charIntMap = new HashMap<>();
    String unique = "";
    for (int i = 0; i < s1.length(); i++) {
      if (!charIntMap.containsKey(s1.charAt(i))) {
        charIntMap.put(s1.charAt(i), -1);
        unique += s1.charAt(i);
      }
    }

    for (int i = 0; i < s2.length(); i++) {
      if (!charIntMap.containsKey(s2.charAt(i))) {
        charIntMap.put(s2.charAt(i), -1);
        unique += s2.charAt(i);
      }
    }

    for (int i = 0; i < s3.length(); i++) {
      if (!charIntMap.containsKey(s3.charAt(i))) {
        charIntMap.put(s3.charAt(i), -1);
        unique += s3.charAt(i);
      }
    }

    boolean[] usedNumbers = new boolean[10];
    solution(unique, 0, charIntMap, usedNumbers, s1, s2, s3);
  }

  public static int getValue(String s,HashMap<Character,Integer>map){
      
      int ans=0;
      int power=1;
      for(int i=s.length()-1;i>=0;i--){
          char ch=s.charAt(i);
          int mapping=map.get(ch);
          ans+=(mapping *power);
          power*=10;
      }
      
      return ans;
      
  }
  public static void solution(String unique, int idx, 
							  HashMap<Character, Integer> map, boolean[] usedNumbers, 
							  String s1, String s2, String s3) {
	    // write your code here
	    
	    if(idx==unique.length()){
	        
	        if((getValue(s1,map)+getValue(s2,map))==getValue(s3,map)){
	            for(int i=0;i<26;i++){
	                char ch=(char)(i+'a');
	                if(map.containsKey(ch)==true){
	                    System.out.print(ch+"-"+map.get(ch)+" ");
	                }
	            }
	        
	        System.out.println();
	        }
	        return ;
	    }
	    
	    
	    char ch=unique.charAt(idx);
	    
	    for(int i=0;i<=9;i++){
	        if(usedNumbers[i]==false){
	            usedNumbers[i]=true;
	            map.put(ch,i);
	            solution(unique,idx+1,map,usedNumbers,s1,s2,s3);
	            usedNumbers[i]=false;
	            map.remove(ch);
	        }
	    }
  }

}
