import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int m=n1;
        int r=n2;
        int A=n1;
        int S=-n1;
        int P=0;
        int count=Integer.SIZE;
        while(count>0){
            if((r&1)==1){
                P+=A;
                S+=m;
            }
            A<<=1;
            S<<=1;
            count--;
            r>>=1;
        }
        System.out.println(P);
    }
}