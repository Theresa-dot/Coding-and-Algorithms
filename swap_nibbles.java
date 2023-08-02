import java.util.*;

class Main{
    public static void main(String []args){
        byte num=(byte)0xAB;
        byte upper_num=(byte) ((num & 0xF0)>>>4);
        byte lower_num=(byte) (num & 0x0F);
        byte swapped_num=(byte) ((lower_num<<4) | upper_num);
        System.out.println(Integer.toBinaryString(swapped_num & 0xFF));
        
    }
}