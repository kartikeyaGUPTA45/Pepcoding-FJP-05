import java.io.*;
import java.util.*;

public class Main {
    public static boolean isPalindrome(String str){
        int left=0;
        int right=str.length()-1;
        
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
	public static void solution(String str, String asf) {
		//write you code here
		if(str.length()==0){
		    System.out.println(asf);
		    return ;
		}
		
		
		for(int i=0;i<str.length();i++){
		    String fh=str.substring(0,i+1);
		    String ros=str.substring(i+1);
		    if(isPalindrome(fh)==true){
		        solution(ros,asf+"(" +fh+") ");
		    }
		}
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		solution(str, "");
	}

}
