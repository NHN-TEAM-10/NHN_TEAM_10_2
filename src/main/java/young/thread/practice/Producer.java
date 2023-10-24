package young.thread.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Producer implements Runnable {
    private List<Item> items = new ArrayList<>();
    private Store store;
    private int interval = 0;

    public Producer(Store store) {
        this.store = store;
    }

    private void produce() {
        Item item = new Item();
        items.add(item);
        System.out.println("생산자가 물품을 생산하였습니다. -> " + item);
    }

    private void sellItem() {
        if (store.getItems().size() <= 10) {
            Item item = this.items.get(0);

            store.buy(item);
            this.items.remove(0);

            System.out.println("생산자가 물품을 판매하였습니다. -> " + item);
        }
    }

    @Override
    public void run() {
        while (true) {
//            interval = ThreadLocalRandom.current().nextInt(1000, 10000);
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
