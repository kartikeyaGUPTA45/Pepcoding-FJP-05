import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code
    
    Stack<Integer>st1=new Stack<>();// operands
    Stack<Character>st2=new Stack<>();// operator
    
    for(int i=0;i<exp.length();i++){
        char ch=exp.charAt(i);
        // if character is operand
        if(ch>='0' && ch<='9'){
            st1.push(ch-'0');
        }else if(ch=='('){
            st2.push(ch);
        }else if(ch=='+' || ch=='-' || ch=='*' ||ch=='/'){
            while(st2.size()>0 && precedence(st2.peek())>=precedence(ch)){
                char operator=st2.pop();
                int op2=st1.pop();
                int op1=st1.pop();
                
                int result=solve(op1,op2,operator);
                st1.push(result);
            }
            st2.push(ch);
            
        }else if(ch==')'){
            while(st2.peek()!='('){
                char operator=st2.pop();
                int op2=st1.pop();
                int op1=st1.pop();
                
                int result=solve(op1,op2,operator);
                st1.push(result);
            }
            st2.pop();
            
        }else{
            //do nothing
        }
    }
    while(st2.size()!=0){
        char operator=st2.pop();
        int op2=st1.pop();
        int op1=st1.pop();
        
        int result=solve(op1,op2,operator);
        st1.push(result);
        
    }
    System.out.println(st1.peek());
    
    
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
 
 public static int precedence(char ch){
     
     if(ch=='+' || ch=='-'){
         return 1;
     }
     else if(ch=='*' || ch=='/'){
         return 2;
     }
     else {
         return 0;
     }
 }
}
