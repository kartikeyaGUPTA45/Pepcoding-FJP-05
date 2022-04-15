import java.io.*;
import java.util.*;

public class Main {
    public static boolean check(Stack<Character>st,char bracket){
        // Less Opening bracket
        if(st.size()==0)
            return false;
        else if(st.peek()!=bracket) {
            return false;
        }else {
            st.pop();
            return true;
        }
    }

    public static void main(String[] args) throws Exception {
        
        Scanner scn=new Scanner(System.in);
        
        String exp=scn.nextLine();
        
        Stack<Character>st=new Stack<>();
        
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            // Opening bracket
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            
            // Closing Bracket
            else if(ch==')'){
                boolean ans=check(st,'(');
                if(ans==false){
                    System.out.println(false);
                    return;
                }
                
            }else if(ch=='}'){
                
                boolean ans=check(st,'{');
                if(ans==false){
                    System.out.println(false);
                    return;
                }
                
            }else if(ch==']'){
            boolean ans=check(st,'[');
                if(ans==false){
                    System.out.println(false);
                    return;
                }
                
            }
        }
        // Less Closing Brackets
        if(st.size()!=0){
            System.out.println(false);
        }else{
            System.out.println(true);
        }

    }

}
