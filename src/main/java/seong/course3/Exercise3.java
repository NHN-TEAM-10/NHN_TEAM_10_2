package seong.course3;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double number1 = sc.nextDouble();
        String operator = sc.next();
        double number2 = sc.nextDouble();


        switch (operator) {
            case "+":
                System.out.println(number1 + number2);
                break;
            case "-":
                System.out.println(number1 - number2);
                break;
            case "*":
                System.out.println(number1 * number2);
                break;
            case "0":
                break;
        }
    }
}
