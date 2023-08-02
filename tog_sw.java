import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean door[]=new boolean[n+1];
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j+=i){
                if (door[j]==false){
                    door[j]=true;
                }
                else door[j]=false;
            }
        }
        int open=0;
        int close=0;
        for(int i=1;i<=n;i++){
            if(door[i]) open++;
            else close++;
        }
        System.out.println(open);
        System.out.println(close);
    }
}