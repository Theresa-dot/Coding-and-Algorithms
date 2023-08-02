import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        if(str.contains("-")){
            int ind=str.indexOf("-");
            System.out.println("-"+str.substring(0,ind)+str.substring(ind+1));
            
        }
        else System.out.println(str);
    }
}