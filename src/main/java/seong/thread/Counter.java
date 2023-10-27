package seong.thread;

public class Counter {

    private String name;
    private int maxCount;

    private int count;

    public Counter(String name, int maxCount) {
        this.name = name;
        this.count = 0;
        this.maxCount = maxCount;
    }

    public void run() {
        while (count <= maxCount) {

            try {
                Thread.sleep(1000);
                System.out.println(this.name + " : " + count);
                this.count++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(e);
            }
        }
    }

    public static void main(String[] args) {
        Counter counter1 = new Counter("counter1", 10);
        Counter counter2 = new Counter("counter2", 10);
        counter1.run();
        counter2.run();
    }
}


