package seong.thread;

public class Exam02 {
    public static void main(String[] args) {
        SelfRunnableCounter counter = new SelfRunnableCounter("Counter", 5);
        counter.start();

    }
}
