package seong.thread.ThreadStore;

import java.util.concurrent.Semaphore;

public class Store {
    private final int maxProductCount = 10;
    private int productCount;

    private final Semaphore storeSemaphore = new Semaphore(10);
    private final Semaphore buySemaphore = new Semaphore(1);

    public Store() {
        this.productCount = 0;
    }

    public void enter() throws InterruptedException {
        storeSemaphore.acquire();
    }

    public void exit() {
        storeSemaphore.release();
    }

    public synchronized void buy() throws InterruptedException {
        buySemaphore.acquire();
        if (this.productCount > 0) {
            this.productCount--;
            System.out.println(Thread.currentThread().getName() + "번 손님 물건 구매 " + this.productCount);
        }
        buySemaphore.release();
    }

    public synchronized void sell() throws InterruptedException {
        if (this.productCount >= maxProductCount) {
            wait();
        }
        this.productCount++;
        System.out.println("물건 입고" + this.productCount);
        notifyAll();
    }
}