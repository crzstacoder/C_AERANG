import java.util.Scanner;

public class class18 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name;
        int salary;

        final int years = 12;

        System.out.print("이름을 입력하세요. : ");
        name = scanner.nextLine();
        System.out.print("월급을 입력하세요. : ");
        salary = scanner.nextInt();

        System.out.println(name +"의 연봉은 "+ (years*salary) + "원 입니다.");
        scanner.close();
    }
}
