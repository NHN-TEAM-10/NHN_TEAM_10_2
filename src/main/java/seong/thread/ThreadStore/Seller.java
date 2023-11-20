package seong.thread.ThreadStore;

import java.util.concurrent.ThreadLocalRandom;

public class Seller extends Thread {
    Store store;

    public Seller(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            try {
                store.sell();
                Thread.sleep(ThreadLocalRandom.current().nextInt(1, 10) * 1000L);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
        }

    }
}

