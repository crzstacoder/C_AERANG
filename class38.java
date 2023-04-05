import java.util.Scanner;

public class class38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        int count1 = 0;

        for (int i =1; i<count; ++i) {
            for (int j=1; j<=i; ++j) {
                if (i==j) {
                    System.out.println(count1 + "\n");
                    break;
                }
                System.out.print(count1 + " ");
                count1 += 1;
            }
        }
    }
}
