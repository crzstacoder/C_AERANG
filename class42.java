import java.util.Scanner;

public class class42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];

        System.out.println("정수 10개를 입력하세요");

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        System.out.println("------------------------");
        for (int i = 0; i<num.length; i++) {
            System.out.print(num[i] + ", ");
        }
    }
}
