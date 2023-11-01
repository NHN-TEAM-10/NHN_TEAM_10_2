package min.chapter2.exercises;

public class Main2 {
    public static void main(String[] args) {
        int firstDice = (int)(Math.random() * 6) + 1;
        int secondDice = (int)(Math.random() * 6) + 1;
        int totalSum = firstDice + secondDice;

        System.out.println("The first die comes up " + firstDice);
        System.out.println("The second die comes up " + secondDice);
        System.out.println("Your total roll is " + totalSum);

    }
}
