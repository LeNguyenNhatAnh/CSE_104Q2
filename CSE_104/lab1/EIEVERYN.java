
import java.util.Scanner;

public class EIEVERYN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testcases = sc.nextInt();
        for (int i = 0; i < testcases; i++) {
            int m = sc.nextInt();
            int n = sc.nextInt();

            boolean[] check = new boolean[n + 1];
            for (int j = 0; j < m; j++) {
                int ai = sc.nextInt();
                if (ai >= 1 && ai <= n)
                    check[ai] = true;
            }

            boolean flag = true;
            for (int j = 1; j <= n; j++) {
                if (check[j] == false) {
                    flag = false;
                }
            }

            if (flag)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        sc.close();
    }
}
