package min.Thread;

public class TestCounter {
    public static void main(String[] args) throws InterruptedException {
        Counter counter1 = new Counter("Counter1");
        Counter counter2 = new Counter("Counter2");

        CounterThread counterThread1 = new CounterThread("CounterThread1");
        CounterThread counterThread2 = new CounterThread("CounterThread2");

        // 1-2
//        counter1.run();
//        counter2.run();

        // 1-4
//        counterThread1.start();
//        counterThread2.start();

        // 1-5
        counterThread1.start();
        counter1.run();



    }

}
