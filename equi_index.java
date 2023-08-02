import java.util.*;

class Main{
    public static void main(String[] args){
        int a[]={-7,1,5,2,-4,3,0};
        int rightSum=0;
        int leftSum=0;
        int maxSum=Integer.MIN_VALUE;
        int posi=-1;
        for(int i=0;i<a.length;i++){
            rightSum+=a[i];
        }
        for(int i=0;i<a.length;i++){
            rightSum-=a[i];
            if(leftSum==rightSum && leftSum>maxSum){
                maxSum=leftSum;
                posi=i;
            }
            leftSum+=a[i];
        }
        System.out.println(maxSum +" "+ posi);
    }
}