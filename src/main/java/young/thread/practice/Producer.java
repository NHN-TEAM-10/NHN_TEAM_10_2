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
        System.out.println("생산자가 물품을 납품하였습니다. -> " + item);
    }

    @Override
    public void run() {
        interval = ThreadLocalRandom.current().nextInt(1, 10);
        try {
            this.produce();

            if (store.getItems().size() <= 10) {
                store.buy(this.items.get(0));
                this.items.remove(0);
            }

            System.out.println("생산자가 새로운 물건을 생산하였습니다. -> " + items.get(items.size() - 1));
            Thread.sleep(interval);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
