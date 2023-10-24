package young.thread.thread8;

public class Exma03 {
    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("group");

        RunnableCounter thread1 = new RunnableCounter(group, "worker1", 100);
        RunnableCounter thread2 = new RunnableCounter(group, "worker2", 100);

        thread1.start();
        thread2.start();

//        Thread.sleep(5000);
        group.interrupt();
        System.out.println("프로그램 종료");

    }
}
