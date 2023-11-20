package seong.course2.chapter8;

import java.util.Scanner;

/**
 * 사용자 입력: 로마숫자일경우는 정수로 출력 정수일경우에는 로마숫자로 출력 정수값은 1~3999 사이의 값이 들어와야 함. 이상한 정수, 로마숫자 들어오면 @throws IllegalArgumentException
 * 빈문자열이 입력되면 프로그램 종료
 */
public class TestExercise3 {
    public static void main(String[] args) {
        boolean again;
        Scanner sc = new Scanner(System.in);
        String str;
        Exercise3 ex3;
        do {
            str = sc.next();
            if (Character.isDigit(str.charAt(0))) {
                try {
                    ex3 = new Exercise3(Integer.parseInt(str));
                    System.out.println(ex3.getRoman());
                } catch (NumberFormatException e) {
                    System.out.println("잘못된 매개변수를 입력했습니다.");
                }
            } else {
                try {
                    ex3 = new Exercise3(str);
                    System.out.println(ex3.getInt());
                } catch (IllegalArgumentException e) {
                    System.out.println("잘못된 매개변수를 입력했습니다");
                }
            }

            System.out.println("계속 진행하시겠습니까?");
            again = sc.nextBoolean();
        } while (again);


    }
}
