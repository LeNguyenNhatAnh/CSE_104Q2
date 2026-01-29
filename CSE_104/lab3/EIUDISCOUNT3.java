import java.util.Scanner;

public class EIUDISCOUNT3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long price = sc.nextLong();
        int onl = sc.nextInt();
        int vip = sc.nextInt();
        int card = sc.nextInt();

        double totalDiscount = 0;
        double[] money = new double[] { 5_000_000, 20_000_000, 100_000_000, 300_000_000, 600_000_000, 900_000_000,
                Long.MAX_VALUE };
        double[] disRate = new double[] { 0.03, 0.05, 0.07, 0.1, 0.12, 0.15 };

        for (int i = 0; i < disRate.length; i++) {
            if (price > money[i])
                totalDiscount += Math.min((money[i + 1] - money[i]), (price - money[i])) * disRate[i];
        }

        long currentPrice = (long) (price - totalDiscount);
        if (onl == 1)
            currentPrice = (long) (currentPrice * 0.98);
        if (vip == 1)
            currentPrice = (long) (currentPrice * 0.98);
        if (card == 1)
            currentPrice = (long) (currentPrice * 0.98);

        System.out.println(currentPrice);
        sc.close();
    }

}
