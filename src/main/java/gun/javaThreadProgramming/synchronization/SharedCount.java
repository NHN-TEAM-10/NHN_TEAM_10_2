package gun.javaThreadProgramming.synchronization;

public class SharedCount {
//    static int count;
//
//    public static int getCount() {
//        return count;
//    }
//
//    public static void setCount(int count) {
//        SharedCount.count = count;
//    }
//
//    public static synchronized void increment() {
//        setCount(getCount() + 1);
//    }
//
    int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void increment() {
        setCount(getCount() + 1);
    }
}
