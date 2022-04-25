import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            for (int k = 0; k < n; k++) {
                arr[j][k] = line.charAt(k) - '0';
            }
        }

        findCelebrity(arr);

    }

    public static void findCelebrity(int[][] arr) {
        // if a celebrity is there print it's index (not position), if there is not then
        // print "none"
        
        Stack<Integer>st=new Stack<>();
        
        for(int i=0;i<arr.length;i++){
            st.push(i);
        }
        
        while(st.size()>=2){
            int a=st.pop();
            int b=st.pop();
            
            if(arr[a][b]==1){
                // a know b->a is not a celebrity
                st.push(b);
            }else{
                // a does not know b->b is not a celebrity
                st.push(a);
                
            }
        }
        
        
        int potential_answer=st.pop();
        // // For row
        // for(int i =0;i<arr.length;i++){
        //     if(i!=potential_answer){
        //         if(arr[potential_answer][i]==1){
        //             System.out.println("none");
        //             return ;
        //         }
        //     }
        // }
        // // for column
        // for(int i =0;i<arr.length;i++){
        //     if(i!=potential_answer){
        //         if(arr[i][potential_answer]==0){
        //             System.out.println("none");
        //             return ;
        //         }
        //     }
        // }
        
        for(int i =0;i<arr.length;i++){
            if(i!=potential_answer){
                if(arr[potential_answer][i]==1 || arr[i][potential_answer]==0){
                    System.out.println("none");
                    return ;
                }
            }
        }
        
        
        System.out.println(potential_answer);
    }

}
