// import java.io.*;
import java.util.*;

public class Main {
  public static void display(int[][] board){
    for(int i = 0; i < board.length; i++){
      for(int j = 0; j < board[0].length; j++){
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }


  public static boolean isoptionValid(int [][]board,int i,int j,int val){
      // Row
      for(int k=0;k<9;k++){
          if(board[i][k]==val){
              return false;
          }
      }
      
    //   Col
    
    for(int k=0;k<9;k++){
        if(board[k][j]==val){
            return false;
        }
    }
    
    
    // 3*3 grid
    
    i=i/3*3;
    j=j/3*3;
    
    
    for(int k=0;k<3;k++){
        for(int l=0;l<3;l++){
            if(board[k+i][l+j]==val){
                return false;
            }
        }
    }
    
    return true;
      
  }
  public static void solveSudoku(int[][] board, int i, int j) {
    // write yopur code here
    if(j==9){
        j=0;
        i++;
    }
    
    if(i==9){ // Base case
        display(board);
        return;
    } 
    
    
    if(board[i][j]!=0){
        solveSudoku(board,i,j+1);
    }else{
        for(int val=1;val<=9;val++){
            if(isoptionValid(board,i,j,val)==true){
                board[i][j]=val;
                solveSudoku(board,i,j+1);
                board[i][j]=0;
            }
        }
    }
    
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int[][] arr = new int[9][9];
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        arr[i][j] = scn.nextInt();
      }
    }

    solveSudoku(arr, 0, 0);
  }
}
