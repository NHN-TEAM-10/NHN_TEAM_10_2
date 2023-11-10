package young.course2.chapter02;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your first name and last name, separated by a space: ");
        String name = sc.nextLine();
        String[] names = name.split(" ");

        System.out.println("Your first name is " + names[0] + ", which has " + names[0].length() + " characters");
        System.out.println("Your last name is " + names[1] + ", which has " + names[1].length() + " characters");
        System.out.println("Your initials are " + names[0].charAt(0) + names[1].charAt(0));
    }
}
