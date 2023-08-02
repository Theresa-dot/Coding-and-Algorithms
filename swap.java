import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        byte num=(byte) Integer.parseInt(str,16);
        byte upper=(byte)((num & 0xF0)>>>4);
        byte lower=(byte)(num & 0x0F);
        byte swap=(byte)((lower<<4)|upper);
        System.out.println(Integer.toBinaryString(swap &0xFF ));
    }
}