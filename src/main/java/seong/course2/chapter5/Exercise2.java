package seong.course2.chapter5;

import java.util.Scanner;

/**
 * 사용자로부터 값을 읽고, StatCalc로 통계를 조사하는 프로그램
 */
public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        StatCalc calc = new StatCalc();
        while ((input = sc.nextInt()) != 0) {
            calc.enter(input);
        }

        System.out.println(calc.getMax());
        System.out.println(calc.getCount());
        System.out.println(calc.getMean());
        System.out.println(calc.getSum());
        System.out.println(calc.getStandardDeviation());
        System.out.println(calc.getMin());
    }
}
