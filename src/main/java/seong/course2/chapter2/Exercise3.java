package seong.course2.chapter2;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.println("사용자 이름을 입력하세요");
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String name = sc.next();

        sb.append("Hello, ").append(name.toUpperCase()).append(",nice to meet you!");

        System.out.println(sb.toString());
    }
}
