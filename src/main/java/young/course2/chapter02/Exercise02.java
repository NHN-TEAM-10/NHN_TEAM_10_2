package young.course2.chapter02;

public class Exercise02 {
    public static void main(String[] args) {
        int firstNumber = (int) (Math.random() * 6) + 1;
        int secondNumber = (int) (Math.random() * 6) + 1;

        System.out.println("The first die comes up " + firstNumber);
        System.out.println("The second die comes up " + secondNumber);
        System.out.println("Your total roll is " + (firstNumber + secondNumber));
    }
}
