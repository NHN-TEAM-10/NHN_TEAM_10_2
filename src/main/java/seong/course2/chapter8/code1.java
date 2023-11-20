package seong.course2.chapter8;

/**
 * 2차 방정식
 * precondition : BB - 4AC >= 0 과 A != 0를 보장한다면
 * x는 방정식의 해.
 */
public class code1 {
    public static void main(String[] args) {
        double A = 1;
        double B = 2;
        double C = 1;
        double disc = B*B - 4 *A *C ;

        double x = (-B + Math.sqrt(disc) )/ (2* A);

        System.out.println(x);
    }
}
