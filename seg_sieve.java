import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        boolean[] prime = new boolean[n + 1];
        for (int i = 2; i <= Math.sqrt(n); i++) {
            prime[i] = true;
        }
        for (int i = 2; i * i <= Math.sqrt(n); i++) {
            if (prime[i]) {
                for (int j = i * i; j <= Math.sqrt(n); j += i) {
                    prime[j] = false;
                }
            }
        }

        boolean[] nprime = new boolean[n - s + 1];
        for (int i = 0; i <= n - s; i++) {
            nprime[i] = true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (prime[i]) {
                int start = (int) Math.ceil((double) s / i) * i;
                if (start == i) {
                    start += i;
                }
                for (int j = start; j <= n; j += i) {
                    nprime[j - s] = false;
                }
            }
        }

        for (int i = 0; i <= n - s; i++) {
            if (nprime[i]) {
                System.out.println(s + i);
            }
        }
    }
}
