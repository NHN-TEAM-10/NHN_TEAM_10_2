package young.course2.chapter5;

/*
Exercise 5.3:

This problem uses the PairOfDice class from Exercise 5.1 and the StatCalc class from Exercise 5.2.

The program in Exercise 4.4 performs the experiment of counting how many times a pair of dice is rolled before a given total comes up.
It repeats this experiment 10000 times and then reports the average number of rolls. It does this whole process for each possible total (2, 3, ..., 12).

Redo that exercise. But instead of just reporting the average number of rolls, you should also report the standard deviation and the maximum number of rolls.
Use a PairOfDice object to represent the dice. Use a StatCalc object to compute the statistics.
(You'll need a new StatCalc object for each possible total, 2, 3, ..., 12. You can use a new pair of dice if you want, but it's not required.)
 */

public class Exercise03 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        PairOfDice dice = new PairOfDice();
        int[] numbers = new int[11];

        for (int i = 0; i < 10000; i++) {
            dice.roll();
            numbers[(dice.getDie1() + dice.getDie2()) - 2]++;
        }

        for (int i = 0; i < numbers.length; i++) {
            sb.append("합이 " + (i + 2) + "가 나온 횟수: " + numbers[i]).append('\n');
        }

        System.out.println(sb);
    }
}
