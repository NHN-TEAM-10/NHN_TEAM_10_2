package young.thread.thread3_5;

public class SelfRunnableCounter implements Runnable {
    private int count;
    private int maxCount;
    private Thread thread;

    public SelfRunnableCounter(String name, int maxCount) {
        this.maxCount = maxCount;
        this.count = 0;
        thread = new Thread(this, name);
    }

    public void start() {
        thread.start();
    }

    public Thread getThread() {
        return this.thread;
    }

    @Override
    public void run() {
        while (count < maxCount) {
            try {
                ++count;
                System.out.println(thread.getName() + " : " + count);
                Thread.sleep(500);
            } catch (InterruptedException ignore) {
                Thread.currentThread().interrupt();
            }
        }

    }
}
