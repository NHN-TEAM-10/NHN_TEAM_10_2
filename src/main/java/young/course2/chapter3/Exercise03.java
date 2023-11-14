package young.course2.chapter3;

import java.util.Scanner;

/*
Write a program that will evaluate simple expressions such as 17 + 3 and 3.14159 * 4.7.
The expressions are to be typed in by the user.
The input always consists of a number, followed by an operator, followed by another number.
The operators that are allowed are +, -, *, and /. You can read the numbers with TextIO.getDouble() and the operator with TextIO.getChar().
Your program should read an expression, print its value, read another expression, print its value, and so on.
The program should end when the user enters 0 as the first number on the line.
 */

public class Exercise03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input expression: ");

        String[] expression = sc.nextLine().split(" ");
        String operator = expression[1];
        double result = -1;
        double firstNumber = Double.parseDouble(expression[0]);
        double secondNumber = Double.parseDouble(expression[2]);

        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                break;

            case "-":
                result = firstNumber - secondNumber;
                break;

            case "*":
                result = firstNumber * secondNumber;
                break;

            default:
                result = firstNumber / secondNumber;
                break;
        }

        System.out.println("result -> " + result);
    }
}
