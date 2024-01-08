package yang.ch2;

import java.util.Scanner;

public class Exercise2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("총 달걀수를 입력하시오: ");
        int total = sc.nextInt();
        int gross = total/144;
        int dozen= total%144/12;
        int remain = total%144%12;

        System.out.println("Your number of eggs is "+ gross+ "gross, "+dozen+"dozen, and "+remain);
    }
}
