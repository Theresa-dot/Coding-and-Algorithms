import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String in=sc.next();
        int cnt=0;
        int maxcnt=Integer.MIN_VALUE;
        for(char c:in.toCharArray()){
            if(c=='1'){
                cnt++;
                if(maxcnt<cnt) maxcnt=cnt;
            }
            else cnt=0;
        }
        System.out.println(maxcnt);
    }
}