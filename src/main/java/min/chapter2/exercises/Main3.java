package min.chapter2.exercises;

import java.util.Locale;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("What is tour Name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello, " + name.toUpperCase() + ", nice to meet you!");
    }
}
