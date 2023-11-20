package seong.course2.chapter4;

import java.util.Scanner;


/**
 * 주사위 합계가 매개변수의 숫자로 나올때까지 한쌍의 주사위를 굴리는 시뮬레이션 precondition : 주사위의 합 입력 (2 - 12) postcondition : 주사위의 합이 나오는데 시행된 횟수.
 */
public class Exercise3 {


    public static void main(String[] args) {
        // 한쌍의 합을 입력받는다
        Scanner sc = new Scanner(System.in);
        int diceSum = sc.nextInt();
        if (diceSum < 2 || diceSum > 12) {
            throw new IllegalArgumentException("유효한 주사위 한 쌍의 합을 입력하세요");
        }
        System.out.println(rollDice(diceSum));

        // 입력 받은 값이 가능한 주사위 총합이 아닌경우 throw error
        // 한쌍 주사위 굴림 시행 결과 한쌍의 합이 입력과 같을경우 return 한다.
        // 횟수를 기록하는 변수 초기화
        // 횟수 추가
        // 주시위 시행 결과가 입력과 같을 경우 break;

    }

    /**
     * 한쌍의 주사위를 던진 결과의 합이 예측과 같아질때까지 시행한 횟수 return precondicion : 2-12의 값 postCondition : 합이 예측과 같아질때까지 시행한 횟수
     */
    private static int rollDice(int diceSum) {
        int count = 0;
        while (true) {
            count++;
            int firstDice = (int) (Math.random() * 6) + 1;
            int secondDice = (int) (Math.random() * 6) + 1;
            if (firstDice + secondDice == diceSum) {
                return count;
            }
        }
    }
}
