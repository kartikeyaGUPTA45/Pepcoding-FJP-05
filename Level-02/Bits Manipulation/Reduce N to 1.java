import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
        System.out.println(solution(n));
    }
    
    public static int solution(int n) {
        long N = n;
        int count = 0;
        while(N != 1) {
            if(N % 2 == 0) {
                N = N >> 1;
            }
            else {
                if(N == 3) {
                    count += 2;
                    break;
                }
                N = (N & 2) == 2 ? N + 1 : N - 1;
            }
            count ++;
        }
        return count;
    }
	
	
}


                        
                        
