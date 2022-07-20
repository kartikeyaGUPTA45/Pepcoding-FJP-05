import java.io.*;
import java.util.*;

public class Main {

  public static void solution(boolean[][] board, int i, int cols, int d1, int d2, String asf) {
    // write your code here
    int n=board.length;
    if(i==board.length){
        System.out.println(asf+".");
        return ;
    }
    
    for(int j=0;j<board.length;j++){
        if((cols&(1<<j))==0 && (d1&(1<<(i+j)))==0 &&(d2&(1<<(i-j+n-1)))==0){
            board[i][j]=true;
            cols|=(1<<j);
            d1|=(1<<(i+j));
            d2|=(1<<(i-j+n-1));
            
            solution(board,i+1,cols,d1,d2,asf+i+"-"+j+", ");
            board[i][j]=false;
            cols&=~(1<<j);
            d1&=~(1<<(i+j));
            d2&=~(1<<(i-j+n-1));
        }
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    boolean[][] board = new boolean[n][n];
    int cols = 0;
    int d1 = 0;
    int d2 = 0;
    solution(board, 0, cols, d1, d2, "");
  }

}
