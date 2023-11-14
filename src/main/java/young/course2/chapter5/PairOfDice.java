package young.course2.chapter5;

public class PairOfDice {

    private int die1;
    private int die2;
    private int count = 0;

    public PairOfDice() {
        this.die1 = 0;
        this.die2 = 0;
    }

    public void roll() {
        this.die1 = (int) (Math.random() * 6) + 1;
        this.die2 = (int) (Math.random() * 6) + 1;
        this.count++;
    }

    public int getDie1() {
        return die1;
    }

    public int getDie2() {
        return die2;
    }

    public int getCount() {
        return count;
    }
}