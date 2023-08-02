import java.util.*;

class Main{
    static void BlockSwap(int arr[],int d,int n){
        if(d==0 || d==n){
            System.out.println("Not possible");
            return;
        }
        else if(d>n) d=d%n;
        int i=d;
        int j=n-d;
        while(i!=j){
            if(i<j){
                swap(arr,d-i,d+j-i,i);
                j-=i;
            }
            else if(i>j){
                swap(arr,d-i,d,j);
                i-=j;
            }
        }
        swap(arr,d-i,d,i);
    }
        
    public static void swap(int arr[],int fi,int si,int d){
        for(int i=0;i<d;i++){
            int temp=arr[fi+i];
            arr[fi+i]=arr[si+i];
            arr[si+i]=temp;
        }
    }
    
    public static void printArray(int arr[],int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7};
        BlockSwap(arr,2,7);
        printArray(arr,7);
    }
}