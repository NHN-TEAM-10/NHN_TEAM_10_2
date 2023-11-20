package seong.course2.chapter8;

import java.util.Scanner;

// 사용자가 지정한 방정식을 해결하기 위해 서브섹션 8.3.3의 다음 서브루틴을 사용하는 프로그램을 작성하십시오. 이 부분은 프로그래밍 관련 코드 또는 더 구체적인 내용이 필요해 보입니다. 제가 정확한 서비스를 제공하기 위해,
// 서브섹션 8.3.3에서 어떤 서브루틴을 사용해야 하는지 추가로 알려주실 수 있을까요?

/**
 * 이 프로그램은 정답중 하나를 출력합니다
 * A*X*X + B*X + C = 0
 * A,B,C값은 user에 의해 입력됩니다.
 */
public class Exercise1 {
    public static void main(String[] args) {
        boolean again = false;
        Scanner sc = new Scanner(System.in);
        do {
            double A = sc.nextInt();
            double B = sc.nextInt();
            double C = sc.nextInt();
            double result;

            try {
                result = root(A, B, C);
                System.out.println(result);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("올바른 매개변수를 입력하세요");
            }


            System.out.println("다른 방정식을 입력하시겠습니까?");
            again = sc.nextBoolean();
        } while (again);
    }

    /**
     * Returns the larger of the two roots of the quadratic equation *A*x*x+B*x+C=0,providedithasanyroots. IfA==0or if
     * the discriminant, B*B - 4*A*C, is negative, then an exception * of type IllegalArgumentException is thrown.
     */
    static public double root(double A, double B, double C)
            throws IllegalArgumentException {
        if (A == 0) {
            throw new IllegalArgumentException("A can’t be zero.");
        } else {
            double disc = B * B - 4 * A * C;
            if (disc < 0) {
                throw new IllegalArgumentException("Discriminant < zero.");
            }
            return (-B + Math.sqrt(disc)) / (2 * A);
        }
    }
}
