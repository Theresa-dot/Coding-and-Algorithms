import java.util.*;

class Main{
    public static void main(String[] args){
        int a[]={14,20,3,6,5};
        int max=a[a.length-1];
        System.out.print(max + " ");
        for(int i=a.length-2;i>-1;i--){
            if(max<a[i]){
                max=a[i];
                System.out.print(max + " ");
            }
        }
    }
}

/*or by brute force method */

import java.util.*;

class Main{
    public static void main(String[] args){
        int a[]={14,20,3,6,5};
        int j=0;
        for(int i=0;i<a.length;i++){
            int key=a[i];
            for(j=i+1;j<a.length;j++){
                if(a[i]<a[j]) break;
            }
            if(j==a.length) System.out.print(a[i] + " ");
        }
    }
}