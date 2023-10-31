package gun.practice2;

import java.util.concurrent.ThreadLocalRandom;

public class Consumer implements Runnable {
    Store store;

    String name;


    public Consumer(String name, Store store) {
        this.store = store;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        store.enter(getName());
        try {
            int purchaseTime = ThreadLocalRandom.current().nextInt(1000, 10001);
            Thread.sleep(purchaseTime);
            store.buy(getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        store.exit(getName());
        Thread.currentThread().interrupt();
    }
}