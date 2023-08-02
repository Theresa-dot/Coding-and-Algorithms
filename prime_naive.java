import java.util.*;

public class Main 
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int flag=0;
        int n=sc.nextInt();
        for(int i=2;i<=n;i++){
            for(int j=2;j<=i/2;j++){
                if(i%j==0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0) System.out.println(i);
            flag=0;
        }
    }
}