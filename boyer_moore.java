import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        int maxCount=0;
        int pos=0;
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]) cnt++;
                if(cnt>maxCount){
                    maxCount=cnt;
                    pos=i;
                }
            }
        }
        if(maxCount>n/2) System.out.println(arr[pos]); 
    }
}