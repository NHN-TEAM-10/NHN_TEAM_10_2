package seong.thread;

public class RunnableCounter implements Runnable {
    private String name;
    private int maxCount;

    private int count;
    private boolean flag;

    public RunnableCounter(String name, int maxCount) {
        this.name = name;
        this.maxCount = maxCount;
        this.count = 0;
        this.flag = true;
    }

    public void stop() {
        if (flag) {
            Thread.currentThread().stop();
        }
    }

    @Override
    public void run() {
        while (flag) {
            try {
                Thread.sleep(1000);
                System.out.println(this.name + " : " + count);
                this.count++;
            } catch (InterruptedException e) {
                System.out.println("쓰레드는 멈추지 않는다구,,,,!!!!");
                Thread.currentThread().checkAccess();
            }
            if (this.count > this.maxCount) {
                this.flag = false;
            }
//            flag = Thread.currentThread().isAlive();
//            try {
//                Thread.sleep(1000);
//                System.out.println(this.name + " : " + count);
//                this.count++;
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            } catch (IllegalArgumentException e) {
//                throw new IllegalArgumentException(e);
//            }
//            if (this.count > this.maxCount) {
//                stop();
//                break;
//            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new RunnableCounter("counter", 10));
        Thread thread2 = new Thread(new RunnableCounter("counter2", 10));
        thread.start();
        thread.interrupt();
        thread2.start();


//        RunnableCounter runnableCounter1 = new RunnableCounter("runableCounter1", 10);
//        RunnableCounter runnableCounter2 = new RunnableCounter("runableCounter2", 10);
//        runnableCounter2.run();
//        runnableCounter1.run();
    }
}
