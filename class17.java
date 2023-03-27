import java.util.Scanner;

public class class17 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in); //Scanner 함수를 sc로 줄여 부르겠다
        // 추가적으로 new는 Heap 메모리에 객체를 생성(공간을 할당)해준다.

        System.out.print("첫 번째 자연수 A를 입력하세요. : "); // println이 아닌 print사용으로 줄바꿈 없이 코드진행
        Integer a = sc.nextInt(); // 정수형 변수 a 를 생성함과 동시에 a값 입력
        System.out.print("두 번째 자연수 B를 입력하세요. : "); //마찬가지로 print사용
        Integer b = sc.nextInt(); // 정수형 변수 b 를 생성함과 동시에 b값 입력

        System.out.println("A + B = " + (a + b)); // a + b 값을 출력
        System.out.println("A - B = " + (a - b)); // a - b 값을 출력
        System.out.println("A * B = " + (a * b)); // a * b 값을 출력 (곱)
        System.out.println("A / B = " + (a / b)); // a / b 값을 출력 (나눗셈)
        System.out.println("A % B = " + (a % b)); // a % b 값을 출력 (나머지)
    }
}
