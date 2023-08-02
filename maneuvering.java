import java.util.*;

class Main {
    static int matrix(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        }
        return matrix(m - 1, n) + matrix(m, n - 1) + matrix(m - 1, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int res = matrix(m, n);
        System.out.println(res);
    }
}
