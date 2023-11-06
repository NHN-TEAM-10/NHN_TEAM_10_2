package gun.javaThreadProgramming.practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Store {
    private String storeName;
    private int itemCount;
    private int maxItemCount = 10;
    private boolean isDelivering;

    public Store(String storeName) {
        this.storeName = storeName;
        // 초기 상태에서 매장에 물건을 채웁니다.
        for (int i = 0; i < maxItemCount; i++) {
            itemCount++;
        }
        // Producer 스레드 시작
        Producer producer = new Producer(this);
        Thread producerThread = new Thread(producer);
        producerThread.start();
    }

    public String getStoreName() {
        return storeName;
    }

    public synchronized void enter(Consumer c) {
        while (itemCount >= maxItemCount) {
            try {
                System.out.println(c.getName() + "이(가) 매장에 입장 대기 중...");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(c.getName() + "이(가) " + storeName + "에 입장하셨습니다.");
    }

    public void exit() {
        System.out.println(storeName + "에서 " + Thread.currentThread().getName() + "이(가) 퇴장하셨습니다.");
    }


    public synchronized void deliverItem(Producer p) {
        if (isDelivering) {
            System.out.println("죄송합니다. 현재 납품 중입니다.");
            return;
        }
        isDelivering = true;
        p.produceItem();
        isDelivering = false;
        itemCount++;
        System.out.println(storeName + "에 물건이 도착했습니다. 현재 전시된 물건 수: " + itemCount);
        notifyAll();
    }

    public synchronized void buyItem(Consumer c) {
        while (itemCount == 0) {
            try {
                System.out.println(c.getName() + "이(가) 물건을 기다리는 중...");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        itemCount--;
        System.out.println(c.getName() + "이(가) 물건을 구매하였습니다. 현재 전시된 물건 수: " + itemCount);
        notifyAll();
    }
}