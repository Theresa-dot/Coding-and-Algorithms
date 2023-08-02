import java.util.*;

class Main{
    static boolean isprime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cnt=0;
        for(int i=2;i<=n;i++){
            if(isprime(i)) System.out.println(i);
        }
    }
}