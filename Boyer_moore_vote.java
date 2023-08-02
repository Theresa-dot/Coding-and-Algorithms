import java.util.*;

class Main{
    public static void main(String[] args){
        int a[]={4,7,4,4,7,4,4,9,4,3};
        int count=0;
        int candidate=0;
        for(int i=0;i<a.length;i++){
            if(count==0){
                candidate=a[i];
                count++;
            }
            else{
                if(candidate==a[i]){
                    count++;
                }
                else count--;
            }
        }
        int maxCount=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==candidate) maxCount++;
        }
        if(maxCount>a.length/2) System.out.println(candidate);
        else System.out.println("null");
    }
}