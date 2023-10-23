package seong.thread.shareShread;

public class TestCounter {
    public static void main(String[] args) {
        Counter counter = new Counter();
        int numberOfIterations = 100000000;

        CountAgent agent1 = new CountAgent(counter, numberOfIterations, true);
        CountAgent agent2 = new CountAgent(counter, numberOfIterations, false);

        long start = System.currentTimeMillis();
        agent1.start();
        agent2.start();


        try {
            agent1.join();
            agent2.join();
        } catch(InterruptedException ignore) {
        }
        long end = System.currentTimeMillis();

        System.out.println("Count : " + counter.getCount());
        System.out.println("AnotherCount: " + counter.getAnotherCount());
        System.out.println(end - start);
    }
}
