package young.course2.chapter4;

import java.util.Scanner;

/*
Write a program that administers a basic addition quiz to the user. There should be ten questions.
Each question is a simple addition problem such as 17 + 42, where the numbers in the problem are chosen at random (and are not too big).
The program should ask the user all ten questions and get the user's answers.
After asking all the questions, the user should print each question again, with the user's answer.
If the user got the answer right, the program should say so; if not, the program should give the correct answer.
At the end, tell the user their score on the quiz, where each correct answer counts for ten points.

The program should use three subroutines, one to create the quiz, one to administer the quiz, and one to grade the quiz.
It can use three arrays, with three global variables of type int[], to refer to the arrays.
The first array holds the first number from every question, the second holds the second number from every questions, and the third holds the user's answers.
 */

public class Exercise08 {
    public static final int problemNumbers = 5;
    public static final int operandNumbers = 2;
    public static int[][] problems;
    public static int[] answers;
    public static final Scanner sc = new Scanner(System.in);

    public Exercise08() {
        problems = makingProblems();
        answers = new int[problemNumbers];
    }

    private int[][] makingProblems() {
        int[][] numbers = new int[problemNumbers][operandNumbers];

        for (int i = 0; i < problemNumbers; i++) {
            for (int j = 0; j < operandNumbers; j++) {
                numbers[i][j] = (int) (Math.random() * 50) + 1;
            }
        }

        return numbers;
    }

    public static void quiz() {
        for (int index = 0; index < problemNumbers; index++) {
            System.out.print(problems[index][0] + " + " + problems[index][1] + " = ");
            answers[index] = sc.nextInt();
        }
    }

    public static String getScore() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < problemNumbers; i++) {
            int answer = problems[i][0] + problems[i][1];
            int userAnswer = answers[i];
            sb.append(problems[i][0] + " + " + problems[i][1] + " = " + userAnswer + " ? --> ");

            if (answer == userAnswer) {
                sb.append("That's right, good job");
            } else {
                sb.append("Wrong answer. The answer is " + answer);
            }
            sb.append('\n');
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Exercise08 exercise08 = new Exercise08();
        Exercise08.quiz();
        System.out.println(getScore());
    }
}
