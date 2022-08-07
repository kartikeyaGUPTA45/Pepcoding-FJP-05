import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for(int i = 1; i < 10;i++){
			dfs(i,n);
		}
	}
	
	public static void dfs(int cur, int n){
		if(cur > n){
			return;
		}
        else{
            System.out.println(cur);
            for(int i = 0;i < 10;i++){
                dfs(10 * cur + i, n);
            }
        }
    }
}


                        


                        
                        
