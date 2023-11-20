package seong.course2.chapter8;


import java.math.BigInteger;
import java.util.Scanner;

/**
 * 사용자가 입력하는 N의 시작값에 대한 3N+1 수열을 출력
 * 정수는 bigInteger type, 시작값은 0보다 커야함.
 * 프로그램은 사용자가 빈줄을 입력할때까지 계속됨.
 * 입력이 잘못된 경우 프로그램은 오류 메시지를 출력하고 계속 진행됨.
 */
public class Exercise2 {
    private static final BigInteger one = new BigInteger("1");
    private static final BigInteger two = new BigInteger("2");
    private static final BigInteger three = new BigInteger("3");
    /**
     * 3N +1을 계산한다.
     * N이 not null이고 0보다 큰지 확인한다.
     * @param N 1보다 큰 정수 값.
     */
    public static void threeNValue(BigInteger N){
        assert N != null && N.signum() == 1 : "Illegal parameter value.";
        int count = 0;
        while(!N.equals(one)){
            count++;
            if(N.testBit(0)){
                N = N.multiply(three).add(one);
            }else{
                N = N.divide(two);
            }
            System.out.println(N);
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        //값 입력받기
        // 0인경우 확인 - 에러
        // 1보다 큰경우 threeNValue subroutine 실행.
        // 값 입력받고 빈 문자열일 경우 종료.
        String str;
        Scanner sc = new Scanner(System.in);
        BigInteger A;
        while (true) {
            System.out.println("N을 입력하세요");
            str = sc.next();
            if (str.isEmpty()) {
                System.out.println("빈값을 입력했습니다");
                break;
            }

            try {
                A = new BigInteger(str);
                if (A.signum() == 1) {
                    threeNValue(A);
                } else {
                    System.out.println("정수값은 0보다 커야합나디.");
                }
            } catch (NumberFormatException e) {
                System.out.println("잘못된 정수 값을 입력했습니다.");
            }
        }


    }
}
