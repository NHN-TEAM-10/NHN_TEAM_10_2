package young.thread.threadMart2;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/*
생산자는 매장에 물건이 부족하지 않도록 채움
물건은 1~10초 간격으로 채움
Thread내에서 난수 생성을 위해서는 ThreadLocalRandom.current().nextInt()를 사용
 */

public class Producer implements Runnable {
    private Store store;
    private Item item;
    private int interval = 0;
    private int itemAmounts;
    public static final int INTERVAL_TIMES = 1000;
    public static final int ITEMS_SIZE = 100;
    Random random;

    public Producer(Store store, String itemName) {
        this.store = store;
        this.item = new Item(itemName);
        random = new Random();
    }

    private void produce() {
        this.itemAmounts += random.nextInt(8) + 1; // 1~9
    }

    private int sellItem() throws InterruptedException {
        int sellAmounts = random.nextInt(8) + 1;

        if (sellAmounts > itemAmounts) { // 재고보다 많이 팔려고 할 때
            while (sellAmounts > itemAmounts) {
                sellAmounts--;
            }
        }

        this.store.buy(item, sellAmounts);

        return sellAmounts;
    }

    public void stop() {
        Thread.currentThread().interrupt();
    }

    @Override
    public void run() {
        int size = 0;

        while (ITEMS_SIZE > size) {
            interval = ThreadLocalRandom.current().nextInt(INTERVAL_TIMES + 2, INTERVAL_TIMES * 10);
            Thread.yield();

            try {
                this.produce();
                size += this.sellItem();
                Thread.sleep(interval);
            } catch (InterruptedException e) {
            }
        }

        this.stop();
    }

    public Item getItem() {
        return item;
    }
}
