package young.course2.chapter4;

/*
This exercise builds on Exercise 4.3.
Every time you roll the dice repeatedly, trying to get a given total, the number of rolls it takes can be different.
The question naturally arises, what's the average number of rolls to get a given total?
Write a function that performs the experiment of rolling to get a given total 10000 times.
The desired total is a parameter to the subroutine. The average number of rolls is the return value.
Each individual experiment should be done by calling the function you wrote for Exercise 4.3.
Now, write a main program that will call your function once for each of the possible totals (2, 3, ..., 12).
It should make a table of the results, something like:

Total On Dice     Average Number of Rolls
-------------     -----------------------
       2               35.8382
       3               18.0607
       .                .
       .                .

 */

public class Exercise04 {
    public static int[] rollingdiceResults() {
        int[] result = new int[7];

        for (int i = 0; i < 10000; i++) {
//            int firstNumber = (int) (Math.random() * 6) + 1;
//            int secondNumber = (int) (Math.random() * 6) + 1;
            int firstNumber = (int) (Math.random() * 3) + 1;
            int secondNumber = (int) (Math.random() * 3) + 1;

            result[firstNumber + secondNumber]++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] result = rollingdiceResults();
        StringBuilder sb = new StringBuilder();
        sb.append("주사위의 총합        평균 굴림 횟수\n").append("-------------     --------------\n");

        for (int i = 2; i < result.length; i++) {
            sb.append("     " + i + "              ");
            sb.append(result[i] / 100.0).append('\n');
        }

        System.out.println(sb);
    }
}
