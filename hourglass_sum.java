import java.util.*;

class Main{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int maxSum=Integer.MIN_VALUE;
    int R=sc.nextInt();
    int C=sc.nextInt();
    int matrix[][]=new int[R][C];
    for(int i=0;i<R;i++){
        for(int j=0;j<C;j++){
            matrix[i][j]=sc.nextInt();
        }
    }
    if(R<3 || C<-3) System.out.println("Not possible");
    else{
        for(int i=0;i<R-2;i++){
            for(int j=0;j<C-2;j++){
                if(matrix[i][j]+matrix[i][j+1]+matrix[i][j+2]+matrix[i+1][j+1]+matrix[i+2][j]+matrix[i+2][j+1]+matrix[i+2][j+2]>maxSum){
                    maxSum=matrix[i][j]+matrix[i][j+1]+matrix[i][j+2]+matrix[i+1][j+1]+matrix[i+2][j]+matrix[i+2][j+1]+matrix[i+2][j+2];
                    
                }
            }
        }
    }
    System.out.println(maxSum);
}
}