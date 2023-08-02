import java.util.*;

class Main{
    public static void main(String args[]){
        int num=0b111011110;
        String anu=Integer.toBinaryString(num);
        int cl=0,pl=0,ml=0;
        for(char a: anu.toCharArray()){
            if (a=='1') cl++; 
            else{
                ml=Math.max(ml,cl+pl+1);
                pl=cl;
                cl=0;
            }
        }
    ml=Math.max(ml,cl+pl+1);
    System.out.println(ml);
    }
}