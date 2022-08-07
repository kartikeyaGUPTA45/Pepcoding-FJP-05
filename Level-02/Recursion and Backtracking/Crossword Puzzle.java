import java.io.*;
import java.util.*;

public class Main {

  public static void solution(char[][] arr, String[] words, int vidx) {
    //write your code here
    if(vidx==words.length){
        print(arr);
        
        return ;
    }
    
    
    String word=words[vidx];
    for(int i=0;i<10;i++){
        for(int j=0;j<10;j++){
            if(arr[i][j]=='-' || arr[i][j]==word.charAt(0)){
                // Place VErtically
                if(canplaceV(arr,i,j,word)==true){
                    boolean visited[]=new boolean[word.length()];
                    placeV(arr,i,j,word,visited);
                    solution(arr,words,vidx+1);
                    unplaceV(arr,i,j,word,visited);
                }
                
                if(canplaceH(arr,i,j,word)==true){
                    boolean visited[]=new boolean[word.length()];
                    placeH(arr,i,j,word,visited);
                    solution(arr,words,vidx+1);
                    unplaceH(arr,i,j,word,visited);
                }
                
                
            }
        }
    }

  }
  
  
  public static boolean canplaceV(char [][] arr,int i,int j,String word){
      // Starting check 
      if(i-1>=0 && arr[i-1][j]=='-'){
          return false;
      }
      
      
      // Space check 
      for(int k=0;k<word.length();k++){
          if((i+k<arr.length) && (arr[i+k][j]=='-' || arr[i+k][j]==word.charAt(k))){
              
          }else {
              return false;
          }
      }
      
      
      
      if(i+word.length()==arr.length || arr[i+word.length()][j]=='+'){
          return true;
      }else {
          return false;
      }
      
      
      
  }
  
  public static void placeV(char[][] arr,int i,int j,String word, boolean visited[]){
      for(int k=0;k<word.length();k++){
          char ch=word.charAt(k);
          if(arr[i+k][j]=='-'){
              visited[k]=true;
              arr[i+k][j]=ch;
          }
          
      }
  }
  
  public static void unplaceV(char[][] arr,int i,int j,String word,boolean visited[]){
      
      for(int k=0;k<word.length();k++){
          if(visited[k]==true){
              visited[k]=false;
              arr[i+k][j]='-';
          }
      }
      
  }
  
  public static boolean canplaceH(char [][] arr,int i,int j,String word){
      // Starting check 
      if(j-1>=0 && arr[i][j-1]=='-'){
          return false;
      }
      
      
      // Space check 
      for(int k=0;k<word.length();k++){
          if((j+k<arr.length) && (arr[i][j+k]=='-' || arr[i][j+k]==word.charAt(k))){
              
          }else {
              return false;
          }
      }
      
      
      
      if(j+word.length()==arr.length || arr[i][j+word.length()]=='+'){
          return true;
      }else {
          return false;
      }
      
  }
  
  public static void placeH(char[][] arr,int i,int j,String word, boolean visited[]){
      for(int k=0;k<word.length();k++){
          char ch=word.charAt(k);
          if(arr[i][j+k]=='-'){
              visited[k]=true;
              arr[i][j+k]=ch;
          }
          
      }
  }
  
  public static void unplaceH(char[][] arr,int i,int j,String word,boolean visited[]){
      
      for(int k=0;k<word.length();k++){
          if(visited[k]==true){
              visited[k]=false;
              arr[i][j+k]='-';
          }
      }
      
  }




  public static void print(char[][] arr) {
    for (int i = 0 ; i < arr.length; i++) {
      for (int j = 0 ; j < arr.length; j++) {
        System.out.print(arr[i][j]);
      }
      System.out.println();
    }

  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    char[][] arr = new char[10][10];
    for (int i = 0 ; i < arr.length; i++) {
      String str = scn.next();
      arr[i] = str.toCharArray();
    }
    int n = scn.nextInt();
    String[] words = new String[n];
    for (int i = 0 ; i  < words.length; i++) {
      words[i] = scn.next();
    }
    solution(arr, words, 0);
  }
}
