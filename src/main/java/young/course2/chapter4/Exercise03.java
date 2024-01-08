package young.course2.chapter4;

/*
Write a function that simulates rolling a pair of dice until the total on the dice comes up to be a given number.
The number that you are rolling for is a parameter to the function.
The number of times you have to roll the dice is the return value of the function.
The parameter should be one of the possible totals: 2, 3, ..., 12.
The function should throw an IllegalArgumentException if this is not the case.
Use your function in a program that computes and prints the number of rolls it takes to get snake eyes. (Snake eyes means that the total showing on the dice is 2.)
 */

public class Exercise03 {
    public static int rollingdice() {
        int firstNumber = (int) (Math.random() * 6) + 1;
        int secondNumber = (int) (Math.random() * 6) + 1;

        return firstNumber + secondNumber;
    }

    public static void main(String[] args) {
        int countingRolls = 0;
        int diceSumNumbers = -1;

        while (diceSumNumbers != 2) {
            diceSumNumbers = rollingdice();
            countingRolls++;
        }

        System.out.println("Your total roll's number is " + countingRolls);
    }
}
