package seong.course2.chapter8;


/**
 * 배열의 최대값을 찾는 서브루틴
 * invariant -> max는 A[i]의 첫 요소중 가장 크다.
 * 시작 전 -> max는 A[i]의 첫요소, i는 첫번째. -> ok
 */
public class code3 {
    static int maxInArray( int[] A ) {
        // " max는 A[0] ~ A[i-1] 보다 크거나 같음".
         int max = A[0];
        int i = 1;
        // i가 A.length에 도달한다.
        while ( i < A.length ) {
            if ( A[i] > max )
                max = A[i];
            i = i + 1;
        }
        //i는 A.length이고
        // max는 A[0] ~ A[i-1]중에 가장 큰 값이다.
        // 루프 불변식을 통한 사고방식은 알고리즘 개발에 유용하다.
        return max;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        System.out.println(maxInArray(a));

    }
}
