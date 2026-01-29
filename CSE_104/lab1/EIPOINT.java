import java.util.Scanner;

public class EIPOINT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();
        int[] gradeScale = new int[] { 90, 85, 80, 75, 70, 65, 60, 55, 53, 52, 50, 0 };
        String[] gradeWord = new String[] { "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F" };
        for (int i = 0; i < gradeWord.length; i++) {
            if (grade >= gradeScale[i]) {
                System.out.println(gradeWord[i]);
                break;
            }
        }
        sc.close();
    }
}
