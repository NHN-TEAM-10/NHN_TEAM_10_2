package seong.thread.shareShread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestHoldAndWaitDeadlock {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();

        Thread task1 = new Thread(()-> {
            while(!Thread.interrupted()) {
                lock.lock();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }finally {
                    lock.unlock();
                }
            }
        });

        Thread task2 = new Thread(()-> {
            while(!Thread.interrupted()) {
                lock.lock();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }finally {
                    lock.unlock();

                }
            }
        });

        task1.start();
        task2.start();

        try {
            for(int i = 0 ; i < 10 ; i++) {
                System.out.println("Task1 : " + task1.getState() + ", Task2 : " + task2.getState());
                if (i == 2) {
                    task2.interrupt();
                }
                Thread.sleep(1000);
            }
            task1.join();
            task2.join();
        } catch(InterruptedException ignore) {
        }

        System.out.println("테스트 종료");
    }
}