import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int cnt=0;
        while(sum<n){
            cnt++;
            sum+=12*cnt*cnt;
        }
        System.out.println(8*cnt);
    }
}