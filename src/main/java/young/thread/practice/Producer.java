package young.thread.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Producer implements Runnable {
    private List<Item> items = new ArrayList<>();
    private Store store;
    private int interval = 0;
    public static final int INTERVAL_TIMES = 1000;

    public Producer(Store store) {
        this.store = store;
    }

    private void produce() {
        Item item = new Item();
        items.add(item);
    }

    private void sellItem() {
        if (store.getItems().size() <= 10) {
            Item item = this.items.get(0);
            try {
                store.buy(item);
            } catch (InterruptedException e) {
                System.err.println("상점의 재고가 가득찼습니다.");
            }
            this.items.remove(0);
        }
    }

    @Override
    public void run() {
        while (true) {
//            interval = ThreadLocalRandom.current().nextInt(INTERVAL_TIMES, INTERVAL_TIMES * 10);
            interval = 1000;
            try {
                this.produce();
                this.sellItem();
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
