package seong.course2.chapter2;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName;
        String lastName;
        System.out.println("Please enter your first name and last name, separated by a space.");

        String name = sc.next();
        int spaceIndex = name.indexOf(' ');

        firstName = name.substring(0, spaceIndex);
        lastName = name.substring(spaceIndex + 1);

        System.out.println("Your first name is " + firstName + ", which has "
                + firstName.length() + " characters.");
        System.out.println("Your last name is " + lastName + ", which has "
                + lastName.length() + " characters.");
        System.out.println("Your initials are " + firstName.charAt(0) + lastName.charAt(0));
    }
}
