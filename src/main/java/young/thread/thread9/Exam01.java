package young.thread.thread9;

public class Exam01 {
    public static void main(String[] args) throws InterruptedException {
        RunnableCounter counter1 = new RunnableCounter("counter1", 100);
        RunnableCounter counter2 = new RunnableCounter("counter2", 100);

        counter2.setDaemon(true);

        counter1.start();
        counter2.start();

        Thread.sleep(250);
        counter1.stop(); // User Thread가 종료되었으니 Daemon Thread가 종료되고, 프로그램이 종료된다.

        System.out.println("Main Thread terminated");

    }

}
