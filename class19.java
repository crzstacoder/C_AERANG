import java.util.Scanner;

public class class19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int num3;

        System.out.print("첫 번째 정수를 입력하세요. : ");
        num1 = sc.nextInt();
        System.out.print("두 번째 정수를 입력하세요. : ");
        num2 = sc.nextInt();
        System.out.print("세 번째 정수를 입력하세요. : ");
        num3 = sc.nextInt();
        System.out.println("결과");
        System.out.println((num1+num2)%num3);
        System.out.println(((num1%num3)+(num2%num3))%num3);
        System.out.println((num1*num2)%num3);
        System.out.println(((num1%num3)*(num2%num3))%num3);

        sc.close();






    }
}
