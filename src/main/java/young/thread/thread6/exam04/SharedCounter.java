package young.thread.thread6.exam04;

public class SharedCounter extends Thread {
    private long maxCount;
    private int count = 0;
    private SharedCount sharedCount;

    public SharedCounter(String name, long maxCount, SharedCount sharedCount) {
        setName(name);
        this.maxCount = maxCount;
        this.sharedCount = sharedCount;
        this.count = 0;
    }

    @Override
    public void run() {
        while (maxCount > count) {
            count++;
            synchronized (sharedCount) {
                sharedCount.increment();
            }
        }
    }
}
