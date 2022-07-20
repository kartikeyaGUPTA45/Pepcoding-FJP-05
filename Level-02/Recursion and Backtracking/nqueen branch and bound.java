import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    boolean[][] board = new boolean[n][n];
    //write your code here
    boolean col[]=new boolean[n];
    boolean d1[]=new boolean[2*n-1];
    boolean d2[]=new boolean[2*n-1];
    
    nqueens(board,col,d1,d2,0,"");
    
  }
  
  public static void nqueens(boolean [][]board,boolean []col,boolean []d1,boolean []d2,int i,String asf){
      int n=board.length;
      if(i==board.length){
          System.out.println(asf+".");
          return;
      }
      
      for(int j=0;j<board.length;j++){
          if(col[j]==false && d1[i+j]==false && d2[i-j+n-1]==false){
              board[i][j]=true;
              col[j]=true;
              d1[i+j]=true;
              d2[i-j+n-1]=true;
              nqueens(board,col,d1,d2,i+1,asf+i+"-"+j+", ");
              board[i][j]=false;
              col[j]=false;
              d1[i+j]=false;
              d2[i-j+n-1]=false;
              
          }
      }
  }

}
