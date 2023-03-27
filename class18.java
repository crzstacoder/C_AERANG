import java.util.Scanner;

public class class18 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //Scanner 함수를 sc로 줄여 호출하겠다.
        String name; //문자열 변수 name 생성
        int salary; //정수형 변수 salary 생성


        final int years = 12; //상수(정수형) 변수 years 생성 ( 12개월 )


        System.out.print("이름을 입력하세요. : "); //print 사용으로 줄바꿈 안함
        name = scanner.nextLine(); // name 변수에 값 입력
        System.out.print("월급을 입력하세요. : "); // pring 사용으로 줄바꿈 안함
        salary = scanner.nextInt(); // salary 변수에 값 입력

        System.out.println(name +"의 연봉은 "+ (years*salary) + "원 입니다."); // 출력
        scanner.close(); //scanner 함수가 계속 실행되고 있으므로, 함수를 닫아 메모리(?) 절감
    }
}
