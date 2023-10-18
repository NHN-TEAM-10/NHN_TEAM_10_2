package young.thread;

public class CounterMain {
    public static void main(String[] args) {
        Counter counter1 = new Counter("counter1", 10);
        Counter counter2 = new Counter("counter2", 10);

        try {
            counter1.run();
            counter2.run();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
