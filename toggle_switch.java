import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int open=0,close=0;
        boolean[] doors=new boolean[n+1];
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j+=i){
                if(doors[j]==true) doors[j]=false;
                else doors[j]=true;
            }
        }
        for(int i=1;i<=n;i++){
            if(doors[i]==true) open++;
            else close++;
        } 
        System.out.println(open);
        System.out.println(close);
    }
}