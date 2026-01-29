import java.util.Scanner;

public class EIUCHRMS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int aThousand = 1000;
        double[] money = { 0, 2000 * aThousand, 5000 * aThousand, 10000 * aThousand, 20000 * aThousand,
                50000 * aThousand, 100000 * aThousand, 200000 * aThousand };
        double[] rate = { 0.03, 0.04, 0.05, 0.06, 0.07, 0.08, 0.09, 0.1 };
        double totalIncome = 0;

        for (int i = 0; i < n; i++) {
            int invoice = sc.nextInt();
            for (int j = rate.length - 1; j >= 0; j--) {
                if (invoice > money[j]) {
                    totalIncome += invoice * (1 - rate[j]);
                    break;
                }
            }
        }
        System.out.println(Math.round(totalIncome));
        sc.close();
    }

}
