package gun.javaThreadProgramming.practice;

import java.util.concurrent.ThreadLocalRandom;

public class Producer implements Runnable {
    private Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            try {
                int productionTime = ThreadLocalRandom.current().nextInt(1000, 10001);
                Thread.sleep(productionTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            store.deliverItem(this);
        }
    }

    public void produceItem() {
        System.out.println(store.getStoreName() + "에 물건을 채웠습니다.");
    }
}
