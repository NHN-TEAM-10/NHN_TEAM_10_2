package seong.thread.shareShread;

public class Counter {
    private int count;
    private int anotherCount;


    public int getAnotherCount() {
        return anotherCount;
    }

    public Counter() {
        this.count = 0;
        this.anotherCount = 0;
    }

    public void increment() {
        synchronized (this) {
            this.count++;
        }
        this.anotherCount++;
    }


    public void decrement() {
        synchronized (this) {
            this.count--;
        }
        this.anotherCount--;
    }


    public long getCount() {
        return this.count;
    }
}
