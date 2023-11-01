package min.chapter2.exercises;

import java.util.Scanner;

public class Main4 {
    public static final int quarterToCent = 25;
    public static final int dimeToCent = 10;
    public static final int nickelToCent = 5;
    public static final int pennyToCent = 1;

    public static final int toDollar = 100;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Quarter : ");
        int quarter = sc.nextInt();
        System.out.print("Dime : ");
        int dime = sc.nextInt();
        System.out.print("Nickel : ");
        int nickel = sc.nextInt();
        System.out.print("Penny : ");
        int penny = sc.nextInt();

        int totalCent = quarter * quarterToCent + dime * dimeToCent + nickel * nickelToCent + penny * pennyToCent;
        int totalDollar = totalCent / toDollar;

        System.out.println("Total Cent is" + totalCent);
        System.out.println("Total Dollar is " + totalDollar);

    }
}
