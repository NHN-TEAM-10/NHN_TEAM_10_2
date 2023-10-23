package seong.thread.shareShread;

import java.util.concurrent.Semaphore;

public class TestClothingStore {
    public static void main(String[] args) {
        Semaphore dressrooms = new Semaphore(5);
        Thread[] customers = new Thread[10];

        for (int i = 0; i < customers.length; i++) {
            int finalI = i +1;
            customers[i] = new Thread(()->{
                try {
                    System.out.println(finalI + "가 대기중 ");
                    dressrooms.acquire();

                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } finally {
                    System.out.println(finalI + "이 퇴장함 ");
                    dressrooms.release();
                }
            });
            customers[i].start();
        }


    }
}
