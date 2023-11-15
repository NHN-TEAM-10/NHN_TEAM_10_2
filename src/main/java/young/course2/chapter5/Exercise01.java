package young.course2.chapter5;

/*
In all versions of the PairOfDice class in Section 5.2, the instance variables die1 and die2 are declared to be public.
They really should be private, so that they would be protected from being changed from outside the class. Write another version of the PairOfDice class in which the instance variables die1 and die2 are private.
Your class will need "getter" methods that can be used to find out the values of die1 and die2.
(The idea is to protect their values from being changed from outside the class, but still to allow the values to be read.)
Include other improvements in the class, including at least a toString() method.

Test your class with a short program that counts how many times a pair of dice is rolled, before the total of the two dice is equal to two.
 */

public class Exercise01 {
    public static void main(String[] args) {
        PairOfDice dice = new PairOfDice();
        int diceSum = -1;

        while (diceSum != 2) {
            dice.roll();
            diceSum = dice.getDie1() + dice.getDie2();
        }

        System.out.println(dice.getCount());
    }
}
