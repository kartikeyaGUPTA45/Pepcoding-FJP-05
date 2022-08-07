import java.io.*;
import java.util.*;

public class Main {

	public static int solution(String[] words, int[] farr, int[] score, int idx) {
		//write your code here
		if(idx==words.length){
		    return 0;
		}
		
// 		NO
		int ans1=solution(words,farr,score,idx+1);
		
// 		YES
        int ans2=0;
        
        boolean isWordPossible=true;
        int scoreOfCurrentWord=0;
        
        for(int i=0;i<words[idx].length();i++){
            char ch=words[idx].charAt(i);
            farr[ch-'a']--;
            scoreOfCurrentWord+=score[ch-'a'];
        }
        
        for(int i=0;i<farr.length;i++){
            if(farr[i]<0){
                isWordPossible=false;
            }
        }
        
        if(isWordPossible==true){
            ans2+=scoreOfCurrentWord+solution(words,farr,score,idx+1);
        }
        for(int i=0;i<words[idx].length();i++){
            char ch=words[idx].charAt(i);
            farr[ch-'a']++;
            
        }
        
		
		
		
		return Math.max(ans1,ans2);
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int nofWords = scn.nextInt();
		String[] words = new String[nofWords];
		for(int i = 0 ; i < words.length; i++) {
			words[i] = scn.next();
		}
		int nofLetters = scn.nextInt();
		char[] letters = new char[nofLetters];
		for (int i = 0; i < letters.length; i++) {
			letters[i] = scn.next().charAt(0);
		}
		int[] score = new int[26];
		for (int i = 0; i < score.length; i++) {
			score[i] = scn.nextInt();
		}
		if (words == null || words.length == 0 || letters == null || letters.length == 0 || score == null
				|| score.length == 0) {
			System.out.println(0);
			return;
		}
		int[] farr = new int[score.length];
		for (char ch : letters) {
			farr[ch - 'a']++;
		}
		System.out.println(solution(words, farr, score, 0));

	}
}
