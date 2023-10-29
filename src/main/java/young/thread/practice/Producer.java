package young.thread.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Producer implements Runnable {
    private List<Item> items;
    private Store store;
    private int interval = 0;
    public static final int INTERVAL_TIMES = 1000;
    public static final int ITEMS_SIZE = 100;

    public Producer(Store store) {
        this.store = store;
        this.items = new ArrayList<>(ITEMS_SIZE);
    }

    private void produce() {
        Item item = new Item();
        items.add(item);
    }

    private void sellItem() {
        if (store.getItems().size() <= 10) {
            Item item = this.items.get(0);
            store.buy(item);
            this.items.remove(0);
        }
    }

    public void stop() {
        Thread.currentThread().interrupt();
    }

    @Override
    public void run() {
        int size = 0;
        while (ITEMS_SIZE > size) {
            interval = ThreadLocalRandom.current().nextInt(INTERVAL_TIMES, INTERVAL_TIMES * 10);
            try {
                this.produce();
                this.sellItem();
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            size++;
        }
    }
}
