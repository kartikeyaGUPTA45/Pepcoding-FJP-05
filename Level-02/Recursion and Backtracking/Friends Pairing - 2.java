import java.io.*;
import java.util.*;

public class Main {
  static int counter = 1;

  public static void solution(int i, int n, boolean[] used, String asf) {
    // write your code here
    
    if(i==n){
        System.out.println(counter+"."+asf);
        counter++;
        return ;
    }
    
    if(used[i]==true){
        solution(i+1,n,used,asf);
    }else{
        // Single
        used[i]=true;
        solution(i+1,n,used,asf+"("+(i+1)+") ");
        
        // Pair
        for(int j=0;j<used.length;j++){
            if(used[j]==false){
                used[j]=true;
                solution(i+1,n,used,asf+"(" +(i+1)+","+(j+1)+") ");
                used[j]=false;
            }
        }
        
        used[i]=false;
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean[] used = new boolean[n];
    solution(0, n, used, "");
  }
}
