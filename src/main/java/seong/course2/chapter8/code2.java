package seong.course2.chapter8;

import java.util.Scanner;

public class code2 {
    public static void main(String[] args) {
        double A,B,C,disc, x;
        Scanner sc = new Scanner(System.in);
        do {
            A = sc.nextDouble();
            B = sc.nextDouble();
            C = sc.nextDouble();
        } while (A == 0 || B * B - 4 * A * C < 0);
        // 루프가 종료된 후, BB-4AC가 0 이상, A가 0이아님을 알 수 있음

        disc = B*B - 4* A*C;
        x = (-B + Math.sqrt(disc) )/ (2* A);
        System.out.println(x);
        // 사전조건을 주의하고 프로그램이 어떻게 이를 처리할지 생각할것.
        // 사전조건은 프로그램을 어떻게 작성할지에 대한 단서 제공


    }
}
