package seong.course2.chapter8;

/**
 * 루프 invariant는 루프가 실행되는동안 참으로 유지되는 선언이다. 루프 invariant는 루프 본문 시작에서 참이라면 끝에서도 참이다.
 * 루프 실행 전 -> invariant가 참인지? i는 0, total도 0
 * 루프 끝나는지 확인
 */
public class invariants {

    /**
     * precondition: 배열 A는 null이 아님. invariant : "total은 A의 첫i 요소의 합".
     *
     * @param A
     * @return
     */
    static int arraySum(int[] A) {
        int total = 0;
        int i = 0;
        // 루프가 끝나는지 확인 -> i는 A.length에 도달.
        while (i < A.length) {
            // total은 A의 첫 i요소의 합
            total = total + A[i];
            // loop invariant를 참으로.
            i = i + 1;
        }
        return total;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3};
       System.out.println(arraySum(a));
    }

}
