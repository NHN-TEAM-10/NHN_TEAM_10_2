package young.thread.thread7.quiz02;

public class Quiz02 {
    public static void main(String[] args) {
        RunnableCounter rc1 = new RunnableCounter("counter1", 3);
        RunnableCounter rc2 = new RunnableCounter("counter2", 3);
        RunnableCounter rc3 = new RunnableCounter("counter2", 3);

        rc1.start();
        rc2.start();
        rc3.start();

        try {
            rc2.join();
            rc3.join();
        } catch (InterruptedException ignore) {
        }
        
        System.out.println("All threads stopped");
    }
}
