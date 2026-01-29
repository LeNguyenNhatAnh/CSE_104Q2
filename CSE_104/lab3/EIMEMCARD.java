import java.util.Scanner;

public class EIMEMCARD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int items = sc.nextInt();

        long[] money = new long[] { 1_000_000, 20_000_000, 50_000_000, 200_000_000 };
        double[] percent = new double[] { 0.02, 0.03, 0.05, 0.07 };
        long totalBefore = 0;
        for (int i = 0; i < items; i++) {
            long price = sc.nextLong();
            double discount = 0;

            for (int j = money.length - 1; j >= 0; j--) {
                if (totalBefore >= money[j]) {
                    discount += price * percent[j];
                    break;
                }
                System.out.println(discount);
            }

            totalBefore += price;
        }
    }

}
