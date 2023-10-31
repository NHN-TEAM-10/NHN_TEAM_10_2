package seong.course2.chapter2;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        System.out.println("달걀 몇개있어?");
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int eggs = sc.nextInt();

        int gross = eggs / 144;
        eggs = eggs - gross * 144;
        int dozen = eggs /12;
        eggs %= 12;

        sb.append("Your number of eggs is ").append(gross).append(" gross, ").append(dozen).append(" dozen, and ")
                .append(eggs
                );

        System.out.println(sb.toString());

    }
}
