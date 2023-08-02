import java.util.*;

class Main{
    static int fact(int f){
        int prod=1;
        for(int i=1;i<=f;i++){
            prod*=i;
        }
        return prod;
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int c=fact(n)/(fact(r)*fact(n-r));
        System.out.println(c);
        
    }
}