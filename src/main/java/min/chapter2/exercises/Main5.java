package min.chapter2.exercises;

import java.util.Scanner;

public class Main5 {
    public static final int GROSS_UNIT = 144;
    public static final int DOZEN_UNIT = 12;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total Egg : ");
        int totalEgg = sc.nextInt();
        int gross = totalEgg / GROSS_UNIT;
        int dozen = totalEgg % GROSS_UNIT / DOZEN_UNIT;
        int eggCount = totalEgg % GROSS_UNIT % DOZEN_UNIT;

        System.out.println(gross);
        System.out.println(dozen);
        System.out.println(eggCount);

    }
}
