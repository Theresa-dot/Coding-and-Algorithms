import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=n;
        for(int p=2;p*p<=n;p++){
            if(n%p==0){
                while(n%p==0) n/=p;
                result-=result/p;
            }
        }
        if(n>1) result-=result/n;
        System.out.println(result);
    }
}