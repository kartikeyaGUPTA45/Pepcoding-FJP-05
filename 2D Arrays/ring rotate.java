import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here

        Scanner scn=new Scanner(System.in);

        int n=scn.nextInt();
        int m=scn.nextInt();
        int [][]arr=new int [n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        int s=scn.nextInt();
        int r=scn.nextInt();

        ringRotate(arr,s,r);
        display(arr);
    }



    public static void ringRotate(int [][]arr,int s,int r){
        // step-01 -> 1D array formation
        int []la=fill1Dfrom2D(arr,s);

        // Step-02 ->rotate the 1D array
        rotate(la,r);

        // Step-03 -> 2D array with 1D (la)

        fill2Dwith1D(arr,s,la);


    }

    // Step-01
    public static int[] fill1Dfrom2D(int [][]arr,int s){

        int n=arr.length;
        int m=arr[0].length;

        int rmin=s-1;
        int cmin=s-1;
        int rmax=n-s;
        int cmax=m-s;

        int idx=0;

        int sz=2*(rmax-rmin)+2*(cmax-cmin);
        int la[]=new int[sz];

        // left boundary

        for(int row=rmin;row<=rmax;row++ ){
            la[idx]=arr[row][cmin];
            idx++;

        }
        cmin++;

        // bottom boundary

        for(int col=cmin;col<=cmax;col++){
            la[idx]=arr[rmax][col];
            idx++;
        }
        rmax--;

        // right boundary

        for(int row=rmax;row>=rmin;row--){
            la[idx]=arr[row][cmax];
            idx++;
        }
        cmax--;

        // top boundary
        for(int col=cmax;col>=cmin;col--){
            la[idx]=arr[rmin][col];
            idx++;
        }
                
        return la;




    }

    // Step-02

    public static void rotate(int []la,int r){

        r=r%la.length;

        if(r<0) {
            r+=la.length;
        }

        reverse(la,0,la.length-1);
        reverse(la,0,r-1);
        reverse(la,r,la.length-1);
    }


    public static void reverse(int []la,int left,int right){

        while(left<right){

            int temp=la[left];
            la[left]=la[right];
            la[right]=temp;

            left++;
            right--;
        }
    }

    
    // step-03
    public static void fill2Dwith1D(int [][]arr,int s,int []la){
        int n=arr.length;
        int m=arr[0].length;

        int rmin=s-1;
        int cmin=s-1;
        int rmax=n-s;
        int cmax=m-s;

        int idx=0;


        // left boundary

        for(int row=rmin;row<=rmax;row++ ){
            arr[row][cmin]=la[idx];
            idx++;

        }
        cmin++;

        // bottom boundary

        for(int col=cmin;col<=cmax;col++){
            arr[rmax][col]=la[idx];
            idx++;
        }
        rmax--;

        // right boundary

        for(int row=rmax;row>=rmin;row--){
            arr[row][cmax]=la[idx];
            idx++;
        }
        cmax--;

        // top boundary
        for(int col=cmax;col>=cmin;col--){
            arr[rmin][col]=la[idx];
            idx++;
        }

    }
    

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
