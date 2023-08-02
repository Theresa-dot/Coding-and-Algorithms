import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String num=sc.next();
        
        Map<Character,Character> map=new HashMap<Character,Character>();
        map.put('6','9');
        map.put('9','6');
        map.put('0','0');
        map.put('1','1');
        map.put('8','8');
        int flag=0;
        int start=0,end=num.length()-1;
        while(start<=end){
            if(!map.containsKey(num.charAt(start))){
                System.out.println("No");
                flag=1;
                break;
            } 
            if(map.get(num.charAt(start))!=num.charAt(end)){
                System.out.println("No");
                flag=1;
                break;
            } 
            start++;
            end--;
        }
        if(flag==0) System.out.println("Yes");
    }
}