package young.thread.thread8;

public class Worker implements Runnable {
    public Worker(String s) {
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignore) {

        }
    }
}
