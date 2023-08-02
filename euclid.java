import java.util.*;

class Main{
    static int Euclid(int n,int m){
        if(m==0) return n;
        return Euclid(m,n%m);
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println(Euclid(n,m));
        
    }
}