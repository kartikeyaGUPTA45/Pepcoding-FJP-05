import java.io.*;
import java.util.*;

public class Main {
    
    public static boolean isSafe(char [][]ans,int row,int col,char sign,int[] top, int[] left, int[] right, int[] bottom){
        
        // Adjancent Cell
        
        if((col-1>=0 &&ans[row][col-1]==sign) || (row-1>=0 && ans[row-1][col]==sign) || (col+1<ans[0].length && ans[row][col+1]==sign) || (row+1<ans.length && ans[row+1][col]==sign)){
            return false;
        }
        
        int rc=rowCount(ans,sign,row);
        int cc=colCount(ans,sign,col);
        
        if(sign=='+'){
            if(top[col]!=-1 && cc>=top[col]){
                return false;
            }
            
            
            if(left[row]!=-1 && rc>=left[row]){
                return false;
            }
        }else {
            
            if(bottom[col]!=-1 && cc>=bottom[col]){
                return false;
            }
            
            if(right[row]!=-1 && rc>=right[row]){
                return false;
            }
            
        }
        
        return true;
        
    }
    public static int colCount(char [][]ans,char sign,int col){
        
        int count=0;
        
        for(int i=0;i<ans.length;i++){
            if(ans[i][col]==sign) count++;
        }
        
        return count;
    }
    
    public static int rowCount(char[][]ans,char sign,int row){
        
        int count=0;
        
        for(int j=0;j<ans[0].length;j++){
            if(ans[row][j]==sign) count++;
        }
        
        
        return count;
        
        
    }
    
    public static boolean isValid(char [][]ans ,int []top,int []left,int []right,int [] bottom){
        for(int i=0;i<top.length;i++){
            if(top[i]!=-1 && top[i]!=colCount(ans,'+',i)){
                return false;
            }
        }
        
        
        for(int i=0;i<left.length;i++){
            if(left[i]!=-1 && left[i]!=rowCount(ans,'+',i))
                return false;
        }
        
        for(int i=0;i<bottom.length;i++){
            if(bottom[i]!=-1 && bottom[i]!=colCount(ans,'-',i)){
                return false;
            }
        }
        
        
        for(int i=0;i<right.length;i++){
            if(right[i]!=-1 && right[i]!=rowCount(ans,'-',i))
                return false;
        }
        
        return true;
        
        
    }

	public static boolean solution(char[][] arr, int[] top, int[] left, int[] right, int[] bottom, char[][] ans,int row, int col){
	    
	    if(col==arr[0].length){
	        col=0;
	        row++;
	    }
	    
	    if(row==arr.length){
	        if(isValid(ans,top,left,right,bottom)==true){
	            return true;
	        }else {
	            return false;
	        }
	    }

		if(arr[row][col]=='L'){
		    
		    if((isSafe(ans,row,col,'+',top,left,right,bottom)) && (isSafe(ans,row,col+1,'-',top,left,right,bottom))){
		        ans[row][col]='+';
		        ans[row][col+1]='-';
		        boolean result=solution(arr,top,left,right,bottom,ans,row,col+2);
		        if(result==true){
		            return true;
		        }
		        
		        ans[row][col]='X';
		        ans[row][col+1]='X';
		    }
		    
		    if((isSafe(ans,row,col,'-',top,left,right,bottom)) && (isSafe(ans,row,col+1,'+',top,left,right,bottom))){
		        ans[row][col]='-';
		        ans[row][col+1]='+';
		        boolean result=solution(arr,top,left,right,bottom,ans,row,col+2);
		        if(result==true){
		            return true;
		        }
		        ans[row][col]='X';
		        ans[row][col+1]='X';
		    }
		}
		
		if(arr[row][col]=='T'){
		    if((isSafe(ans,row,col,'+',top,left,right,bottom)) && (isSafe(ans,row+1,col,'-',top,left,right,bottom))){
		        ans[row][col]='+';
		        ans[row+1][col]='-';
		        boolean result=solution(arr,top,left,right,bottom,ans,row,col+1);
		        if(result==true){
		            return true;
		        }
		        
		        ans[row][col]='X';
		        ans[row+1][col]='X';
		    }
		    
		    if((isSafe(ans,row,col,'-',top,left,right,bottom)) && (isSafe(ans,row+1,col,'+',top,left,right,bottom))){
		        ans[row][col]='-';
		        ans[row+1][col]='+';
		        boolean result=solution(arr,top,left,right,bottom,ans,row,col+1);
		        if(result==true){
		            return true;
		        }
		        
		        ans[row][col]='X';
		        ans[row+1][col]='X';
		    }
		    
		}
		
		boolean result=solution(arr,top,left,right,bottom,ans,row,col+1);
		if(result==true) return true;

		return false;
	}

	public static void print(char[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		int n = scn.nextInt();
		char[][] arr = new char[m][n];
		for (int i = 0; i < arr.length; i++) {
			String str = scn.next();
			arr[i] = str.toCharArray();
		}
		int[] top = new int[n];
		for (int i = 0; i < n; i++) {
			top[i] = scn.nextInt();
		}
		int[] left = new int[m];
		for (int i = 0; i < m; i++) {
			left[i] = scn.nextInt();
		}
		int[] right = new int[m];
		for (int i = 0; i < m; i++) {
			right[i] = scn.nextInt();
		}
		int[] bottom = new int[n];
		for (int i = 0; i < n; i++) {
			bottom[i] = scn.nextInt();
		}

		//write your code here
		
		char ans[][]=new char[m][n];
		
		for(char[]a:ans){
		    Arrays.fill(a,'X');
		}
		
		
		if(solution(arr,top,left,right,bottom,ans,0,0)==true){
		    print(ans);
		}else {
		    System.out.println("No Solution");
		}
		
		
		
	}

	
}
