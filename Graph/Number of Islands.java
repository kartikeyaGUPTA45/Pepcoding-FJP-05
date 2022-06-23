import java.io.*;
import java.util.*;

public class Main {
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int m = Integer.parseInt(br.readLine());
      int n = Integer.parseInt(br.readLine());
      int[][] arr = new int[m][n];

      for (int i = 0; i < arr.length; i++) {
         String parts = br.readLine();
         for (int j = 0; j < arr[0].length; j++) {
            arr[i][j] = Integer.parseInt(parts.split(" ")[j]);
         }
      }

      // write your code here
      boolean visited[][]=new boolean[n][m];
      
      int islands=0;
      for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
              if(arr[i][j]==0 && visited[i][j]==false){
                  getComp(arr,i,j,visited);
                  islands++;
              }
          }
      }
      
      System.out.println(islands);
   }
   
   public static void getComp(int [][]arr,int i,int j,boolean [][] visited){
       if(i<0 || j<0 || i>=arr.length ||j>=arr[0].length ||visited[i][j]==true ||arr[i][j]==1){
           return ;
       }
       
       visited[i][j]=true;
       getComp(arr,i,j+1,visited);
       getComp(arr,i,j-1,visited);
       getComp(arr,i+1,j,visited);
       getComp(arr,i-1,j,visited);
       
   }

}
