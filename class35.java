import java.util.Scanner;

public class class35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        System.out.print("영어 시험 점수를 입력하세요. : ");
        int eng = sc.nextInt();
        String result ;


        if (eng>=90) {
            result = "A";
        } else if (eng>=80) {
            result = "B";
        } else if (eng>=70) {
            result = "C";
        } else if (eng>=60) {
            result = "D";
        } else {
            result = "F";
        }
        System.out.printf(result + "학점입니다.");

    }
}
