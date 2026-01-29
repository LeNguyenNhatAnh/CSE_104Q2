import java.util.Scanner;

public class EIAUCTION {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] count = new int[7]; 
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            arr[i] = sc.nextInt();
            count[arr[i]]++;
        }
        
        int resultIndex = -1;
        for (int i = 6; i >=1; i--) {
            if (count[i]==1) {
                for (int j = 0; j < n; j++) {
                    if (arr[j]==i) {
                        resultIndex=j+1;
                        break;
                    }
                }
            }
        }

        if(resultIndex!=-1)
            System.out.println(resultIndex);
        else
            System.out.println("none");
        sc.close();
    }

}
