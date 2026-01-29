import java.util.Scanner;

public class EIUPASSBOOK {
    Scanner sc = new Scanner(System.in);

    long money = sc.nextLong();
    int month = sc.nextInt();
    int months = sc.nextInt();
    double interest1 = sc.nextDouble();
    double interest2 = sc.nextDouble();

 
    long passbook = money * (1 + interest1/100);
    int time = month - months;
    long interest = 1+ interest2/100 * time/12;
    long maxresullt = passbook/interest; 

}
