import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] div = new int[size];
        int[] rem = new int[size];
        for (int i = 0; i < size; i++) {
            div[i] = sc.nextInt();
            rem[i] = sc.nextInt();
        }

        int x = 1;
        int j;
        while (true) {
            for (j = 0; j < size; j++) {
                if (x % div[j] != rem[j]) {
                    break;
                }
            }
            if (j == size) {
                System.out.println(x);
                break;
            }
            x++;
        }
    }
}
