import java.util.Scanner;

public class class25 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            int number;

            number = s.nextInt();

            switch (number) {
                case 0:
                    System.out.println("없음");
                    break;
                case 1:
                    System.out.println("하나");
                case 2:
                    System.out.println("둘");
                    break;
                default:
                    System.out.println("많음");
                    break;
            }

        }
    }



