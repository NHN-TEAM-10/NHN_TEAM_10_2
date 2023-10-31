package seong.course2.chapter2;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quarter = 0;
        int dime = 0;
        int nickel = 0;
        int penny = 0;

        System.out.println("쿼터를 입력하세용");
        quarter = sc.nextInt();
        System.out.println("다임을 입력하세용");
        dime = sc.nextInt();
        System.out.println("니클을 입력하세용");
        nickel = sc.nextInt();
        System.out.println("페니를 입력하세용");
        penny = sc.nextInt();

        double dollars = (0.25 * quarter) + (0.10 * dime)
                + (0.05 * nickel) + (0.01 * penny);

        System.out.printf("%1.2f", dollars);

    }
}
