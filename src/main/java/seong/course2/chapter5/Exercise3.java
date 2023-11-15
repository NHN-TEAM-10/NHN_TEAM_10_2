package seong.course2.chapter5;

/**
 * 주사위 총합이 2~12이 나올때까지 주사위를 굴린다.
 * 이를 10000번 시행하여 평균값, 표준편차, 최대 굴림횟수를 구한다.
 * StatCalc와 PairOfDice class를 사용한다.
 */
public class Exercise3 {
    public static void main(String[] args) {
        final int LEAST_DICE_SUM = 2;
        final int MAX_DICE_SUM = 12;
        final int DICE_ROLL_COUNT = 10000;
        Exercise1 pairOfDice = new Exercise1();
        for (int i = LEAST_DICE_SUM; i <= MAX_DICE_SUM; i++) {
            StatCalc statCalc = new StatCalc();
            for (int j = 0; j < DICE_ROLL_COUNT; j++) {
                statCalc.enter(pairOfDice.countRoll(i));
            }
            System.out.print("주사위 " + i + " 평균: "+ statCalc.getMean() + " ");
            System.out.print("표준편차: "+statCalc.getStandardDeviation()+ " ");
            System.out.print("최대값: "+statCalc.getMax());
            System.out.println();

        }
    }
}
