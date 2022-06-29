import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        
        String str=scn.next();
        
        HashMap<Character,Integer>map=new HashMap<>();
        
        int maxfreq=0;
        char maxFreqCharacter='a';
        
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(map.containsKey(c)==true){
                int freq=map.get(c);
                freq+=1;
                map.put(c,freq);
            }else{
                map.put(c,1);
            }
            
            if(map.get(c)>maxfreq){
                maxfreq=map.get(c);
                maxFreqCharacter=c;
            }
        }
        
        System.out.println(maxFreqCharacter);
    }

}
