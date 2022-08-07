import java.io.*;
import java.util.*;

public class Main {
    public static String swap(String str,int i,int j){
        
        char chi=str.charAt(i);
        char chj=str.charAt(j);
        
        String left=str.substring(0,i);
        String mid=str.substring(i+1,j);
        String right=str.substring(j+1);
        
        
        return left+chj+mid+chi+right;
        
    }
	static String max;
	public static void findMaximum(String str, int k) {
		//write your code here
		
		if(Integer.parseInt(str)>Integer.parseInt(max)){
		    max=str;
		}
		
		if(k==0){
		    return;
		}
		
		
		for(int i=0;i<str.length()-1;i++){
		    for(int j=i+1;j<str.length();j++){
		        if(str.charAt(i)<str.charAt(j)){
		            String subAns=swap(str,i,j);
		            findMaximum(subAns,k-1);
		        }
		    }
		}
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		int k = scn.nextInt();
		 max = str;
		findMaximum(str, k);
		System.out.println(max);
	}

}
