package yang.Thread;

public class TestCounter {
    public static void main(String[] args) throws InterruptedException {
//        Counter counter1 = new Counter("Counter_1",10);
//        Counter counter2 = new Counter("Counter_2",10);
//        counter1.run();
//        counter2.run(); -> 두개의 클래스로 돌리기
//        CounterThread counterThread1 = new CounterThread("counterThread1");
//        CounterThread counterThread2 = new CounterThread("CounterThread2");
//        counterThread1.start();
//        counterThread2.start(); -> 두개의 Thread 활용하기
       Counter counter = new Counter("Counter",10);
       CounterThread counterThread = new CounterThread("CounterThread");
//
        counterThread.start(); //프로그램이 시작되는 main 함수도 하나의 Thread이다.
        counter.run();

    }
}
