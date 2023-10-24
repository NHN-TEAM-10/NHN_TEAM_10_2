package young.thread.practice;

import java.util.concurrent.ThreadLocalRandom;

public class Consumer implements Runnable {
    private String name;
    private Store store;
    private int interval = 0;

    public Consumer(String name, Store store) {
        this.name = name;
        this.store = store;
    }

    private void itemBuying() {
        try {
            store.sell();
        } catch (InterruptedException e) {
            System.err.println("상점의 진열 공간에 물품이 부족합니다.");
        }
    }

    public void stop() {
        Thread.currentThread().interrupt();
    }

    @Override
    public void run() {
        try {
            interval = ThreadLocalRandom.current().nextInt(1000, 10000);
            Thread.sleep(interval);
            store.enter(this);
            interval = 1000;
            itemBuying();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        store.exit(this);
    }

    public String getName() {
        return name;
    }
}
