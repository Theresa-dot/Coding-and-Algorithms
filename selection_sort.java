import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        for (int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            int min=arr[i];
            int pos=i;
            for(int j=i+1;j<5;j++){
                if(arr[j]<min){
                    pos=j;
                    min=arr[j];
                }
            }
            if(pos!=i){
                int temp=arr[i];
                arr[i]=arr[pos];
                arr[pos]=temp;
            }
        }
        for (int i=0;i<0;i++){
            System.out.printf("%d ",arr[i]);
        }
    }
    
}