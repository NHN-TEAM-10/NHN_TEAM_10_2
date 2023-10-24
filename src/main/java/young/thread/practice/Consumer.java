package young.thread.practice;

import java.util.concurrent.ThreadLocalRandom;

public class Consumer implements Runnable {
    private String name;
    private Store store;
    private int interval = 0;
    public static int consumerNumber = 1;
    private int itemCountNumber = 0;

    public Consumer(String name, Store store) {
        this.name = name;
        this.store = store;
    }

    private void itemBuying() {
        store.sell();
    }

    public void stop() {
        Thread.currentThread().interrupt();
    }

    @Override
    public void run() {
        try {
            while (itemCountNumber > 3) {
                interval = ThreadLocalRandom.current().nextInt(1, 10);
                store.enter(this);
                itemBuying();
                Thread.sleep(interval);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            store.exit(this);
        }
    }

    public String getName() {
        return name;
    }
}
