import java.util.Scanner;

public class EIUSALES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salary = sc.nextDouble();
        double rate = 0;
        double[] money = new double[] { 0, 20, 50, 200, 500, 2000, Long.MAX_VALUE };
        double[] bonus = new double[] { 0.02, 0.03, 0.04, 0.05, 0.06, 0.07 };

        for (int i = 0; i < bonus.length; i++) {
            if (salary > money[i])
                rate += Math.min(money[i + 1] - money[i], (salary - money[i])) * bonus[i];
        }

        System.out.printf("%.3f", rate);
        sc.close();
    }

}
