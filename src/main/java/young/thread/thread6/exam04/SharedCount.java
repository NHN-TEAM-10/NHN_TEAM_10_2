package young.thread.thread6.exam04;

public class SharedCount {
    private int count;

    public SharedCount() {
        this.count = 0;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public synchronized void increment() {
        setCount(this.getCount() + 1);
    }

    public int getCount() {
        return count;
    }
}
