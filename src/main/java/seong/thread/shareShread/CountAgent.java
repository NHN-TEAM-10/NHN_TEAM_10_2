package seong.thread.shareShread;

public class CountAgent extends Thread{
    final Counter counter;
    int numberOfIterations;
    boolean increment;

    public CountAgent(Counter counter, int numberOfIterations, boolean increment) {
        super();
        this.counter = counter;
        this.numberOfIterations = numberOfIterations;
        this.increment = increment;
    }

    @Override
    public void run() {
        for(int i = 0 ; i < numberOfIterations; i++) {
            if (increment) {
                counter.increment();
            } else {
                counter.decrement();
            }
        }
    }
}
