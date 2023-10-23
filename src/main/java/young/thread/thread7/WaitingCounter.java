package young.thread.thread7;

public class WaitingCounter implements Runnable {
    RunnableCounter counter;
    Thread thread;

    public WaitingCounter(RunnableCounter counter) {
        this.counter = counter;
        thread = new Thread(this);
    }

    public Thread getThread() {
        return this.thread;
    }

    public void start() {
        this.thread.start();
    }

    public boolean isAlive() {
        return this.thread.isAlive();
    }

    @Override
    public void run() {
        try {
            counter.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
