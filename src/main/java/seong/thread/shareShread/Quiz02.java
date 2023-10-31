package seong.thread.shareShread;

public class Quiz02 {
    public static void main(String[] args) throws InterruptedException {
        RunnableCounter runnableCounter1 = new RunnableCounter("count1", 10);
        RunnableCounter runnableCounter2 = new RunnableCounter("count2", 10);
        RunnableCounter runnableCounter3 = new RunnableCounter("count3", 10);


        runnableCounter1.start();
        runnableCounter2.start();
        runnableCounter3.start();

        runnableCounter1.join();
        runnableCounter2.join();
        runnableCounter3.join();

        System.out.println("프로그램 종료");
    }
}
