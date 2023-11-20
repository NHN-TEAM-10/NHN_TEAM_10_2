package seong.course2.chapter5;

/**
 * 주사위 2개를 관리하는 Class
 */
public class Exercise1 {
    public static void main(String[] args) {
        Exercise1 dice = new Exercise1(2,3);
        System.out.println(dice.toString());
        System.out.println(dice.countRoll(2));
    }
    private int die1; // 첫 번째 주사위에 표시되는 숫자.

    @Override
    public String toString() {
        return "주사위 "+
                "die1=" + die1 +
                ", die2=" + die2;
    }

    private int die2; // 두 번째 주사위에 표시되는 숫자.

    public int getDie1() {
        return die1;
    }

    public int getDie2() {
        return die2;
    }

    public Exercise1(int val1, int val2) {
        die1 = val1;
        die2 = val2;
    }

    public Exercise1(){
        this(getADie(), getADie());
    }

    /**
     * 주사위 한쌍을 굴린다
     * precondition : 한쌍의 주사위 variable 선언
     * postcondition : 한쌍의 주사위에 ~6까지의 random value assign
     */
    private void roll() {
        die1 = getADie();
        die2 = getADie();
    }

    private static int getADie() {
        return (int) (Math.random() * 6) + 1;
    }

    /**
     * 두 숫자의 합이 2가 나올때까지 주사위를 몇번 던졌는지 테스트
     * precondition : 2 ~ 12의 정수값이 입력돼야 한다.
     * @param diceSum
     * @return 시행 횟수
     */
    public int countRoll(int diceSum){
        if(diceSum < 2 || diceSum > 12){
            throw new IllegalArgumentException();
        }
        int count = 0;
        while (this.die1 + this.die2 != diceSum) {
            count++;
            roll();
        }
        return count;
    }
}
