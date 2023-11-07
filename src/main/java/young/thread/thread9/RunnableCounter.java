package young.thread.thread9;

public class RunnableCounter implements Runnable {
    private int maxCount;
    private Thread thread;
    private int interval;
    private int count = 0;

    public RunnableCounter(String counter1, int maxCount) {
        this.thread = new Thread(this, counter1);
        this.maxCount = maxCount;
    }

    public void start() {
        this.thread.start();
    }

    public void increment() {
        this.count++;
    }

    public void setDaemon(boolean on) {
        this.thread.setDaemon(on);
    }

    public void stop() {
        this.thread.interrupt();
    }

    @Override
    public void run() {
        try {
            while (count < maxCount) {
                increment();
                System.out.println(thread.getName() + " : " + getCount());
                Thread.sleep(interval);
            }
        } catch (InterruptedException ignore) {
            Thread.currentThread().interrupt();
        }
    }

    public int getCount() {
        return count;
    }

    public Thread getThread() {
        return this.thread;
    }
}
