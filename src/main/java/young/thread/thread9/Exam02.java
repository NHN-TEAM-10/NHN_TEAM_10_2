package young.thread.thread9;

public class Exam02 {
    public static void main(String[] args) throws InterruptedException {
        Worker worker = new Worker("external worker1", 100);

        worker.start();

        Thread.sleep(250);
        worker.stop();

        System.out.println("Main Thread terminated");
    }
}
