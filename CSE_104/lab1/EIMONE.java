import java.util.Scanner;

public class EIMONE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int money = sc.nextInt();
        /*
        int temp = 0;
        if(money>=20){
            temp = money/20;
            System.out.println("20 " + temp);
            money = money - 20*temp;
        }
        if(money>=10){
            temp = money/10;
            System.out.println("10 " + temp);
            money = money - 10*temp;
        }
        if(money>=5){
            temp = money/5;
            System.out.println("5 " + temp);
            money = money - 5*temp;
        }
        if(money>=1){
            temp = money/1;
            System.out.println("1 " + temp);
            money = money - 1*temp;
        }
         */

        int[] bankNotes = new int[] { 20, 10, 5, 1 };
        for (int i = 0; i < bankNotes.length; i++) {
            int temp = money / bankNotes[i];
            if (money>=bankNotes[i]) {
                System.out.println(bankNotes[i] + " " + temp);
                money -= bankNotes[i] * temp;
            }
            
        }
        sc.close();
    }

}
