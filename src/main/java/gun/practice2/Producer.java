package gun.practice2;

import java.util.concurrent.ThreadLocalRandom;

public class Producer implements Runnable {
    private Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true){
            try {
                store.producerSemaphore.acquire();

                int purchaseTime = ThreadLocalRandom.current().nextInt(1000, 10001);
                Thread.sleep(purchaseTime);
                store.sell();

                store.producerSemaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
