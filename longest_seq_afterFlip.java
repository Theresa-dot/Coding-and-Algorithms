import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int maxLength=0,currentLength=0,previousLength=0;
        int num=sc.nextInt();
        String binaryString=Integer.toBinaryString(num);
        for(char digit: binaryString.toCharArray()){
            if(digit=='1'){
                currentLength++;
            }
            else{
                maxLength=Math.max(maxLength,currentLength+previousLength+1);
                previousLength=currentLength;
                currentLength=0;
            }
        }
        maxLength=Math.max(maxLength,currentLength+previousLength+1);
        System.out.println(maxLength);

        
    }
}