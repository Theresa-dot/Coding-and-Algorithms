import java.util.*;

class Main{
    static int Euclid(int a,int b){
        int x=Math.max(a,b);
        int y=Math.min(a,b);
        if(y==0) return x;
        return Euclid(b,a%b);
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(Euclid(a,b));
    }
}