import java.util.Scanner;

public class class17 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 자연수 A를 입력하세요. : ");
        Integer a = sc.nextInt();
        System.out.print("두 번째 자연수 B를 입력하세요. : ");
        Integer b = sc.nextInt();

        System.out.println("A + B = " + (a + b));
        System.out.println("A - B = " + (a - b));
        System.out.println("A * B = " + (a * b));
        System.out.println("A / B = " + (a / b));
        System.out.println("A % B = " + (a % b));
    }
}
