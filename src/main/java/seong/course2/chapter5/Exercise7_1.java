package seong.course2.chapter5;

public class Exercise7_1 {
    public static void main(String[] args) {
        IntQuestion bigQuestion = new IntQuestion() {
            @Override
            public String getQuestion() {
                return "What is the answer to the ultimate question " + " of life, the universe, and everything?";
            }

            @Override
            public int getCorrectAnswer() {
                return 42;
            }
        };
        System.out.println(bigQuestion.getQuestion());
        System.out.println(bigQuestion.getCorrectAnswer());
    }
}
