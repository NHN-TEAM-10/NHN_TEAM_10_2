package young.thread;

import static java.lang.Thread.sleep;

public class Counter {
    private int number;
    private String name;
    private int maxNumber;

    public Counter(String name, int maxNumber) {
        this.name = name;
        this.maxNumber = maxNumber;
        this.number = 1;
    }

    public void run() throws InterruptedException {
        for (int i = 0; i < maxNumber; i++) {
            System.out.println(name + " : " + number);
            number++;
            sleep(1000);
        }
    }

    public static void main(String[] args) {
        Counter counter = new Counter("counter", 10);
        try {
            counter.run();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
