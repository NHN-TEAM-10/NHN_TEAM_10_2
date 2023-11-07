package young.thread.thread8;

public class RunnableCounter implements Runnable {
    private Thread thread;
    private int maxCount;
    private long interval = 250;

    public RunnableCounter(ThreadGroup group, String name, int maxCount) {
        this.thread = new Thread(group, this, name);
        this.maxCount = maxCount;
    }

    public void start() {
        thread.start();
    }

    @Override
    public void run() {
        try {
            Thread.sleep(interval);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
