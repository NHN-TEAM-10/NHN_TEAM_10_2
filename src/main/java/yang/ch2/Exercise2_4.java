package yang.ch2;

import java.util.Scanner;

public class Exercise2_4 {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        System.out.println("가지고 있는 quater의 수를 입력하세요");
        int quater = sc.nextInt();
        System.out.println("가지고 있는 dime의 수를 입력하세요");
        int dime = sc.nextInt();
        System.out.println("가지고 있는 nickel의 수를 입력하세요");
        int nickel = sc.nextInt();
        System.out.println("가지고 있는 penny의 수를 입력하세요");
        int penny = sc.nextInt();

        int total = penny+5*nickel+10*dime+25*quater;

        int doller = total/100;
        int remain = total%100;

        System.out.println(doller+"달러"+remain+"센트");
    }
}
