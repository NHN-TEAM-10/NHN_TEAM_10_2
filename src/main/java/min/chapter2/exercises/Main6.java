package min.chapter2.exercises;
import java.util.Scanner;
public class Main6 {
    public static void main(String[] args) {

        System.out.println("Please enter your first name and last name, separated by a space.");
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String firstName = name.substring(0, name.indexOf(" "));
        String lastName = name.substring(name.indexOf(" ") + 1, name.length());

        System.out.println("Your first name is " + firstName + " which has " + firstName.length() + " characters");
        System.out.println("Your last name is " + lastName + " which has " + lastName.length() + " characters");
    }
}
