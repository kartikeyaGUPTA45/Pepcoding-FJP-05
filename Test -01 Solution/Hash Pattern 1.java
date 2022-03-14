import java.util.*;

public class Solution {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    int N=2*n-1;
    
    
    for(int i=0; i<N; i++){
        
        for(int j=0; j<N; j++){
            
            int ateveryIndex = Math.min(Math.min(i,j) , Math.min(N-i-1, N-j-1 ) );
            
            int value = n-ateveryIndex;
            
            if(value%2 !=0){
                System.out.print("#\t");
                
            }
            else 
            System.out.print(value + "\t");
        }
        System.out.println();
    }
  }
}
