package seong.thread;

public class ThreadCounter extends Thread{
    private String name;
    private int maxCount;
    private int count;

    public ThreadCounter(String name, int maxCount) {
        this.name= name;
        this.maxCount = maxCount;
        this.count = 0;
    }
    @Override
    public void run() {
        while (!interrupted()) {
            try {
                sleep(1000);
                System.out.println(this.name + " : " + count + ", 쓰레드 상태 : " + isAlive() + ", is interrupted? : " + isInterrupted());
                count++;
            } catch (InterruptedException e) {
                System.out.println("쓰레드는 멈추지않아요");
            }
            if (this.count > this.maxCount) {
                interrupt();
            }
        }

//        while (this.count <= this.maxCount) {
//            try {
//                sleep(1000);
//                System.out.println(this.name + " : " + count);
//                count++;
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            } catch (IllegalArgumentException e) {
//                throw new IllegalArgumentException(e);
//            }
//        }

    }

    public static void main(String[] args) {
        ThreadCounter threadCounter1 = new ThreadCounter("threadCounter1", 100);
        ThreadCounter threadCounter2 = new ThreadCounter("threadCounter2", 100);
        threadCounter1.start();
        threadCounter1.interrupt();
        threadCounter2.start();
    }

}
