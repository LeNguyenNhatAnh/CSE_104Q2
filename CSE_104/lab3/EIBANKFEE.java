import java.util.Scanner;

public class EIBANKFEE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        int sec = sc.nextInt();
        double[] monthlyFee = new double[] { 12.00, 7.5, 5.00, 0 };
        double[] check = new double[] { 0.20, 0.20, 0.10, 0 };
        double[] sodu = new double[] { 500, 2000, 5000, Long.MAX_VALUE };
        double fee = 0;
        for (int i = 0; i < check.length; i++) {
            if (money < sodu[i]) {
                fee = monthlyFee[i] + check[i] * sec;
                break;
            }
        }
        System.out.printf("%.2f", fee);
    }
}
