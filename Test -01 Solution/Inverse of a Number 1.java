import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int totaldig=0;
        int temp=n;
        while(temp>0){
            temp=temp/10;
            totaldig++;
        }
        int ans=0;
        int p=totaldig;
        while(n>0){
            int dig=n%10;
            n=n/10;
            ans+=p*Math.pow(10,totaldig-dig);
            p--;
        }
        System.out.println(ans);
    }
}
