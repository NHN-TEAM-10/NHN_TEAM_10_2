package seong.thread;

public class SelfRunnableCounter implements Runnable {
    int count;
    int maxCount;
    Thread thread;

    public SelfRunnableCounter(String name, int maxCount) {
        this.maxCount = maxCount;
        count = 0;
        thread = new Thread(this, name);
    }

    public void start() {
        this.thread.start();

    }
    @Override
    public void run() {
        while (count <= maxCount) {
            try {
                Thread.sleep(1000);
                System.out.println(thread.getName() + " : " + count);
                this.count++;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
