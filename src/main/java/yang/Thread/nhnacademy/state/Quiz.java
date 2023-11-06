package yang.Thread.nhnacademy.state;

public class Quiz {
    public static void main(String[] args) {


        RunnableCounter r1 = new RunnableCounter("counter1", 5);
        RunnableCounter r2 = new RunnableCounter("counter2", 5);

        r1.start();
        r2.start();


        try {
            r1.join();
            r2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("All thread stopped");
    }

}
