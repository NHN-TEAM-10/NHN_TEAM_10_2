package young.thread.thread6.exam03;

public class SharedCounter extends Thread {
    private long maxCount;
    private int count = 0;

    public SharedCounter(String name, long maxCount) {
        setName(name);
        this.maxCount = maxCount;
        this.count = 0;
    }

    @Override
    public void run() {
        while (maxCount > count) {
            count++;
            SharedCount.increment();
        }
    }
}
