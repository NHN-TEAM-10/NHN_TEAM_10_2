package seong.course2.chapter8;

public class Quiz5 {
    public static void threeNPlusOne(int N){
        assert N < 0 : "음수 입력하셨습니다";

        assert N > 2_147_483_647 : "정수범위보다 큰 값을 입력했습니다.";

        while(N != 1) {
            if(N %2 == 0) {
                N = 3 * N +1;
            }else{
                N = N/2;
            }
        }
    }

    public static void main(String[] args) {
        threeNPlusOne(-1);
    }
}
