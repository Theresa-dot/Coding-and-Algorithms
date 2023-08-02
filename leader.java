import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        int n=arr.length;
        int max=arr[n-1];
        System.out.println(max);
        for (int i=n-2;i>=0;i--){
            if(arr[i]>max){
                System.out.println(arr[i]);
                max=arr[i];
            }  
        }
    }
}