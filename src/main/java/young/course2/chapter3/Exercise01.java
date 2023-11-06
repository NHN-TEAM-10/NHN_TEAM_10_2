package young.course2.chapter3;

/*
How many times do you have to roll a pair of dice before they come up snake eyes? You could do the experiment by rolling the dice by hand.
Write a computer program that simulates the experiment.
The program should report the number of rolls that it makes before the dice come up snake eyes. (Note: "Snake eyes" means that both dice show a value of 1.)
Exercise 2.2 explained how to simulate rolling a pair of dice.
 */
public class Exercise01 {
    public static void main(String[] args) {
        int countingRolls = 0;
        int firstNumber = -1;
        int secondNumber = -1;

        while (!(firstNumber == 1 && secondNumber == 1)) {
            firstNumber = (int) (Math.random() * 6) + 1;
            secondNumber = (int) (Math.random() * 6) + 1;
            countingRolls++;
        }

        System.out.println("Your total roll's number is " + countingRolls);
    }
}
