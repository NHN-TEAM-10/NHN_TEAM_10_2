package gun.javaThreadProgramming.thread_class_extension;

public class RunnableCounter implements Runnable {
    String name;
    int count;
    Thread thread;
    boolean running;

    public RunnableCounter(String name, int count) {
        this.name = name;
        this.count = count;
        this.thread = new Thread(this, name);
        this.running = false;
    }

    public void start() {
        thread.start();
    }
    public void setStop(){
        this.running = false;
    }

    public void interrupt() {
        setStop();
        thread.interrupt();
    }

    @Override
    public void run() {
        this.running = true;
        try {
            while (running && !Thread.interrupted()) {
                System.out.println("(" + running + ")" + name + " : " + count++);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        RunnableCounter counter1 = new RunnableCounter("RunnableCount1", 0);
        RunnableCounter counter2 = new RunnableCounter("RunnableCount2", 0);

        counter1.start();
        counter2.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        counter1.interrupt();
//        counter2.interrupt();
        counter1.setStop();
        counter2.setStop();
//        ExecutorService pool = Executors.newFixedThreadPool(2);
//
//        pool.execute(new RunnableCounter("counter1", 0));
//        pool.execute(new RunnableCounter("counter2", 0));
//
//        pool.shutdown();
//
//        System.out.println("Shutdown called");
//        while (!pool.awaitTermination(10, TimeUnit.SECONDS)) {
//            System.out.println("Not yet finished");
//        }
//        System.out.println("All service finished");

        System.out.println();
        System.out.println("Thread가 중단되었습니다.");
        System.out.println("(" + counter1.running + ")" + counter1.name);
        System.out.println("(" + counter1.running + ")" + counter2.name);
    }
}
