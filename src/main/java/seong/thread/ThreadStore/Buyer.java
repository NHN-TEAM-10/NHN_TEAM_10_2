package seong.thread.ThreadStore;

import java.util.concurrent.ThreadLocalRandom;


public class Buyer extends Thread {
    Store store;

    public Buyer(String name, Store store) {
        super(name);
        this.store = store;
    }

    @Override
    public void run() {
            try {
                store.enter();
                System.out.println(Thread.currentThread().getName() + "번 손님 입장");
                Thread.sleep(ThreadLocalRandom.current().nextInt(1, 10) * 1000L);
                try{
                    store.buy();
                } finally {
                    System.out.println(Thread.currentThread().getName() + "번 손님 퇴장");
                    store.exit();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
        }

}

