import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a=Integer.toBinaryString(n);
        String r="";
        int len=a.length();
        for (int i=len-1;i>=0;i--){
            r+=a.charAt(i);
        }
        if(a.equalsIgnoreCase(r)) System.out.println("Pallindrome");
        else System.out.println("Not");
    }
    
}