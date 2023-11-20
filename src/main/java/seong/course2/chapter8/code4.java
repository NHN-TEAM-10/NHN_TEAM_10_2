package seong.course2.chapter8;

//
public class code4 {
    public static void main(String[] args) {
        int i = 0;
        int[] A = {3, 2, 1};
        while (i < A.length) {
            // Loop invariant:  A[0] <= A[1] <= ... <= A[i-1]

            // Code that adds A[i] to the sorted portion of the array
            int j =0;
            while (j < i) {
                if(A[i] < A[j] ){

                }
            }
            i = i + 1;

        }
        // At this point, i = A.length, and A[0] <= A[1] <= ... <= A[A.length-1]
    }
}
