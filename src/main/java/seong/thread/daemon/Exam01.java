package seong.thread.daemon;

import seong.thread.thread_pool.RunnableCounter;

public class Exam01 {
    public static void main(String[] args) throws InterruptedException {
        RunnableCounter count1 = new RunnableCounter("counter2",10);
        RunnableCounter count2 = new RunnableCounter("counter2", 10);

        count2.setDaemon(true);

        count1.start();
        count2.start();

        Thread.sleep(5000);
        count1.stop();

        System.out.println("Main Thread Terminated");
    }
}
