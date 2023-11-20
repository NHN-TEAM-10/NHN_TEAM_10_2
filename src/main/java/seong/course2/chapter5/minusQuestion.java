package seong.course2.chapter5;

public class minusQuestion implements IntQuestion {
    private int a;
    private int b;

    public minusQuestion() {
        this.a = (int) (Math.random() * 50)+51;
        this.b = (int) (Math.random() * 50);
    }

    @Override
    public String getQuestion() {
        return "what is " + a + " - " + b + "?";
    }

    @Override
    public int getCorrectAnswer() {
        return a - b;
    }
}
