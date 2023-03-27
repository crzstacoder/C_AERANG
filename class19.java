import java.util.Scanner;

public class class19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //scanner 함수를 sc로 줄여 호출하겠다.

        int num1; // 정수형 변수 num1 생성
        int num2; // 정수형 변수 num2 생성
        int num3; // 정수형 변수 num3 생성

        System.out.print("첫 번째 정수를 입력하세요. : "); //print 사용으로 줄바꿈 안함
        num1 = sc.nextInt(); //num1 에 값 입력
        System.out.print("두 번째 정수를 입력하세요. : "); //print 사용으로 줄바꿈 안함
        num2 = sc.nextInt(); //num2 에 값 입력
        System.out.print("세 번째 정수를 입력하세요. : "); //print 사용으로 줄바꿈 안함
        num3 = sc.nextInt(); //num3 에 값 입력
        System.out.println("결과"); //출력
        System.out.println((num1+num2)%num3); //(num1+num2)%num3 값 출력
        System.out.println(((num1%num3)+(num2%num3))%num3); //((num1%num3)+(num2%num3))%num3 값 출력
        System.out.println((num1*num2)%num3); //(num1*num2)%num3 값 출력
        System.out.println(((num1%num3)*(num2%num3))%num3); //((num1%num3)*(num2%num3))%num3 값 출력
//주석을 달자.
        sc.close(); //scanner 함수 계속 실행중이므로 종료해준다.


    }
}
