package seong.thread;

public class RunnableCounter implements Runnable {
    private String name;
    private int maxCount;

    private int count;

    public RunnableCounter(String name, int maxCount) {
        this.name = name;
        this.maxCount = maxCount;
        this.count =0;
    }

    @Override
    public void run() {
        while (count <= maxCount) {

            try {
                Thread.sleep(1000);
                System.out.println(this.name + " : " + count);
                this.count++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(e);
            }
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableCounter("a", 10));
        thread.start();
//        RunnableCounter runnableCounter1 = new RunnableCounter("runableCounter1", 10);
//        RunnableCounter runnableCounter2 = new RunnableCounter("runableCounter2", 10);
//        runnableCounter2.run();
//        runnableCounter1.run();
    }
}
