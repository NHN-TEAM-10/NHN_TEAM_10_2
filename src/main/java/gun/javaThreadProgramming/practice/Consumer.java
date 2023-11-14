package gun.javaThreadProgramming.practice;

import java.util.concurrent.ThreadLocalRandom;

public class Consumer implements Runnable {
    private Store store;
    private String consumerName;

    public Consumer(String consumerName, Store store) {
        this.store = store;
        this.consumerName = consumerName;
    }

    public String getName() {
        return consumerName;
    }

    @Override
    public void run() {
        store.enter(this);
        while (true) {
            try {
                int purchaseTime = ThreadLocalRandom.current().nextInt(1000, 10001);
                Thread.sleep(purchaseTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (store) {
                store.buyItem(this);
            }
            break; // 물건을 한 번 구매한 후 스레드 종료
        }
        store.exit();
    }
}