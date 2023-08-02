import java.util.*;

class Main{
    public static long karatsubaMulti(long x, long y){
        if(x<10 || y<10) return x*y;
        int n=Math.max(Long.toString(x).length(),Long.toString(y).length());
        int half=(n+1)/2;
        long a=x/(long) Math.pow(10,half);
        long b=x%(long) Math.pow(10,half);
        long c=y/(long) Math.pow(10,half);
        long d=y%(long) Math.pow(10,half);
        long ac=karatsubaMulti(a,c);
        long bd=karatsubaMulti(b,d);
        long abcd=karatsubaMulti(a+b,c+d)-ac-bd;
        return (long)(ac*Math.pow(10,n)+abcd*Math.pow(10,half)+bd);
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long x=sc.nextInt();
        long y=sc.nextInt();
        System.out.println(karatsubaMulti(x,y));
    }
}