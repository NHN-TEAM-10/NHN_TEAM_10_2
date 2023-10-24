package young.thread.practice;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.locks.Lock;

public class Consumer implements Runnable {
    private String name;
    private Store store;
    private int interval = 0;
    private int maxCount = 0;
    public static final int END_NUMBERS = 3;
    public static final int INTERVAL_TIMES = 1000;

    public Consumer(String name, Store store) {
        this.name = name;
        this.store = store;

        System.out.println("Thread creates");
    }

    private void itemBuying() {
        try {
            store.sell();
        } catch (InterruptedException e) {
            System.err.println("상점에 재고가 부족합니다.");
        }
    }

    public void stop() {
        Thread.currentThread().interrupt();
    }

    @Override
    public void run() {
        try {
            store.enter(this); // 고객 입장 후에

            while (maxCount < END_NUMBERS) { // 물품 구매 횟수
                interval = 2500;
//                interval = ThreadLocalRandom.current().nextInt(INTERVAL_TIMES, INTERVAL_TIMES * 10);
                itemBuying();
                Thread.sleep(interval);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        store.exit(this);
    }

    public String getName() {
        return name;
    }
}
