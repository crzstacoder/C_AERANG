import com.sun.org.apache.xalan.internal.xsltc.trax.XSLTCSource;

import java.util.Scanner;

public class class23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("정수를 입력하세요 : ");
        int x = s.nextInt();

        if (x==1) {
            System.out.println("x=1");
        }
        else if (x==2) {
            System.out.println("x=2");
        }
        else if (x==3) {
            System.out.println("x=3");

        }
        else {
            System.out.println("???");
        }

    }
}
