package seong.course2.chapter4;

/**
 * 주사위 한쌍의 합이 2-12가 되는데 걸리는 시행 횟수 평균 값을 출력 한다.
 */
public class Exercise4 {


    public static void main(String[] args) {
        final int TEST_COUNT = 10000;
        rollDices(TEST_COUNT);
        // 2-12를 반복
        // 각각 10000번 수행한다.
        // rollDice의 횟수를 합산하여 10000으로 나눈다.

    }

    /**
     * 2- 12까지 주사위 굴리기 시행을 TESTCount만큼 시행
     * preCondition : TEST_COUNT는 유효한 정수.
     * @param TEST_COUNT
     */
    private static void rollDices(int TEST_COUNT) {
        final int LOWER_DICE_SUM = 2;
        final int UPPER_DICE_SUM = 12;
        for (int i = LOWER_DICE_SUM; i <= UPPER_DICE_SUM; i++) {
            int result = 0;
            for (int j = 0; j < TEST_COUNT; j++) {
                result += rollDice(i);
            }
            print(TEST_COUNT, i, result);
        }
    }

    /**
     * rollDices 결과를 출력한다.
     * @param TEST_COUNT
     * @param i
     * @param result
     */
    private static void print(int TEST_COUNT, int i, int result) {
        System.out.println(i + "는 평균" + result / TEST_COUNT + "만큼 시행함.");
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
