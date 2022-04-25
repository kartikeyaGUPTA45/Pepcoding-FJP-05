import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code
    
    Stack<Integer>st1=new Stack<>();
    Stack<String>st2=new Stack<>();
    Stack<String>st3=new Stack<>();
    
    
    for(int i=0;i<exp.length();i++){
        char ch=exp.charAt(i);
        
        if(ch>='0' && ch<='9'){
            st1.push(ch-'0');
            st2.push(ch+"");
            st3.push(ch+"");
        }else{
            
            //Evaluation
            int op2=st1.pop();
            int op1=st1.pop();
            int ans=solve(op1,op2,ch);
            st1.push(ans);
            
            // Infix
            String opp2=st2.pop();
            String opp1=st2.pop();
            
            st2.push('('+opp1+ch+opp2+')');
            
            
            // Prefix
            String oppp2=st3.pop();
            String oppp1=st3.pop();
            
            st3.push(ch+oppp1+oppp2);
            
        }
    }
    
    System.out.println(st1.pop());
    System.out.println(st2.pop());
    System.out.println(st3.pop());
    
 }
 
 public static int solve(int op1,int op2,char operator){
    if(operator=='+'){
        return op1+op2;
    }else if(operator=='-'){
        return op1-op2;
    }else if(operator=='*'){
        return op1*op2;
    }else {
        return op1/op2;
    }
 }
}
