package young.thread.thread6.exam03;

public class SharedCount {
    public static int count = 0;

    public SharedCount() {
    }

    public synchronized static void increment() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}
