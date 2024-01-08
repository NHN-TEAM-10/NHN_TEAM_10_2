package gun.javaThreadProgramming.thread_class_extension;

public class ThreadCounter extends Thread{
    String name;
    int count;

    public ThreadCounter(String name, int count) {
        this.name = name;
        this.count = count;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                System.out.println(name+" : "+count++);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        ThreadCounter counter1 = new ThreadCounter("ThreadCounter1",0);
        ThreadCounter counter2 = new ThreadCounter("ThreadCounter2",0);

        counter1.start();
        counter2.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        counter1.interrupt();
        counter2.interrupt();

        System.out.println("Thread가 중단되었습니다.");
    }
}
