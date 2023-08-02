import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0, maxcount = 0;
        String a = Integer.toBinaryString(num);
        for (char digit : a.toCharArray()) {
            if (digit == '1') {
                count++;
                if (maxcount < count) {
                    maxcount = count;
                }
            } 
            else {
                count = 0;
            }
        }
        System.out.println(maxcount);
    }
}
