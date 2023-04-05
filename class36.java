import java.util.Scanner;

public class class36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int answer = (int) (Math.random() * 100) + 1;
        int guess = -1;
        int count = 0;

        while (guess != answer) {
            System.out.print("1부터 100까지의 정수를 입력하세요: ");
            guess = sc.nextInt();
            count += 1;

            if (guess > answer) {
                System.out.println("더 작은 수를 입력하세요.");
            } else if (guess < answer) {
                System.out.println("더 큰 수를 입력하세요. ");
            } else {
                System.out.println("정답입니다! " + count + "번 만에 맞췄습니다.");
            }
        }
    }
}
