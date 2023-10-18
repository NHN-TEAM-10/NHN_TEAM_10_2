package young.thread.thread1_2;

public class ThreadCounterMain {
    public static void main(String[] args) throws InterruptedException {
        ThreadCounter threadCounter1 = new ThreadCounter("threadCounter1", 10);
//        ThreadCounter threadCounter2 = new ThreadCounter("threadCounter2", 10);
        Counter counter = new Counter("Counter", 10);

        threadCounter1.start();
        counter.run();
//        threadCounter2.start();

//        threadCounter1.run();
//        threadCounter2.run();

    }
}
