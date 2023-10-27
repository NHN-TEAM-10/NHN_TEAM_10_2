package gun.practice2;

import java.util.concurrent.Semaphore;

public class Store {
    int item;
    Semaphore consumerSemaphore;
    Semaphore producerSemaphore;

    public Store() {
        System.out.println("***** 매장이 오픈 되었습니다. *****");
        this.item = 10;
        this.consumerSemaphore = new Semaphore(5);
        this.producerSemaphore = new Semaphore(1);
    }


    public void enter(String name) {
        try {
            consumerSemaphore.acquire(); // 손님이 입장하기 위한 세마포어 획득
            System.out.println("매장에 "+name+"이(가) 입장 했습니다.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void exit(String name) {
        consumerSemaphore.release(); // 손님이 퇴장하여 세마포어 해제
        System.out.println("매장에 "+name+ "이(가) 가게에서 나갔습니다.");
    }

    public synchronized void buy(String name) {
        while (item <= 0) {
            try {
                System.err.println(name + "이(가) 물건을 기다립니다.");
                wait(); // 아이템이 없으면 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        item--;
        System.out.println(name + "이(가) 물건을 구매했습니다. (남은 아이템: " + item + ")");
        notify();
    }

    public synchronized void sell() {
        while (item >= 10) {
            try {
                System.err.println("납품 업체가 대기 중입니다. (현재 아이템: " + item + ")");
                wait(); // 아이템이 10개 이상이면 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        item++;
        System.out.println("납품 업체에서 재고를 추가했습니다. (남은 아이템: " + item + ")");
        notify();
    }
}