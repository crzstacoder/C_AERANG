import java.util.Scanner;

public class class22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("정수(1 ~ 3) 입력하세요 : ");
        int x = s.nextInt();

        if (x==1) {
            System.out.println(" x = 1 ");
        }
        else {
            if (x==2) {
                System.out.println("x==2");
            }
            else {
                if (x==3) {
                    System.out.println("x=3");
                }
                else {
                    System.out.println("???");
                }
            }
        }
    }
}
