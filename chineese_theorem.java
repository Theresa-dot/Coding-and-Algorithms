import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int div[]=new int[5];
        int rem[]=new int[5];
        for(int i=0;i<5;i++){
            div[i]=sc.nextInt();
            rem[i]=sc.nextInt();
        }
        int x=1;
        int j;
        while(true){
            for(j=0;j<5;j++){
                if(x%div[j]!=rem[j]) break;
            }
            if(j==5) System.out.println(x);
            else x++;
        }
    }
}