package yang.ch2;

import java.util.Scanner;

public class Exercise2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("사용자 이름을 입력하시오: ");
        String name = sc.next();
        name = name.toUpperCase();
        System.out.println("\"Hello, "+name+", nice to meet you!\"");
    }
}
