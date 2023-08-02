import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int limits=sc.nextInt();
        boolean[] prime=new boolean[limits+1];
        for(int i=2;i<=limits;i++){
            prime[i]=true;
        }
        int p;
        for (p=2;p*p<=limits;p++){
            if(prime[p]==true) {
                for(int k=p*p;k<=limits;k+=p){
                    prime[k]=false;
                }
            }
        }
        for(int j=0;j<limits;j++){
            if(prime[j]==true){
                System.out.print(j+" ");
            }
        }
    }
}