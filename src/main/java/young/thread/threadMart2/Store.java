package young.thread.threadMart2;

/*
매장은 물건을 납품 받아서 판매한다.
매장에는 최대 10개의 물건만 전시할 수 있다.
매장은 최대 5명까지만 동시 입장 가능하다.
매장에서 물건 구매는 동시에 1명만 가능하다.
매장에서 물건 판매 후 빈 공간에 생기면 생산자에게 알려 준다.
매장에서 물건 납품은 동시에 1명만 가능하다.
매장에서 물건이 들어오면 소비자에게 알려 준다.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Semaphore;

public class Store {
    private Map<Item, Integer> items;
    private Semaphore producers;
    private Semaphore consumers;
    private ThreadGroup consumersThreadGroup;
    private ThreadGroup producersThreadGroup;
    private static final int consumersPermitNumbers = 5;

    public Store(int producerNumbers, int consumerNumbers) {
        items = new HashMap<>(producerNumbers);
        producers = new Semaphore(1);
        consumers = new Semaphore(consumersPermitNumbers);
        consumersThreadGroup = new ThreadGroup("Consumers thread group");
        producersThreadGroup = new ThreadGroup("Producers thread group");
    }

    public synchronized void enter(String consumerName) throws InterruptedException {
        if (consumersThreadGroup.activeCount() < consumersPermitNumbers) {
            Thread consumer = new Thread(consumersThreadGroup, new Consumer(consumerName, this));
            consumer.start();
        }
    }

    public void exit(Consumer consumer) { // 고객만 나가는 것으로 하기.
        System.out.println(consumer.getName() + "이 퇴장하였습니다.");
        consumer.stop();
    }

    public void buy(Item item, int itemAmounts) throws InterruptedException { // 상인에게 물건을 사는 행위
        producers.acquire();

        if (items.containsKey(item)) {
            int oldAmounts = items.get(item);
            items.replace(item, oldAmounts, itemAmounts + oldAmounts);

            System.out.println("기존의 물품(" + item.getName() + ")이 " + itemAmounts + "만큼 추가 납품되었습니다.");
        } else {
            items.put(item, itemAmounts);
            System.out.println("새로운 물품이 납품되었습니다. --> " + item.getName());
        }

        producers.release();
    }

    public void sell(String itemName) throws InterruptedException { // TODO: 물건을 구매하는 것은 동시에 1명만 가능하다.
        consumers.acquire();

        for (Item searchItem : items.keySet()) {
            if (searchItem.getName().equals(itemName)) {
                int changeAmount = items.get(searchItem);

                if (changeAmount > 0) {
                    items.replace(searchItem, changeAmount - 1);

                    System.err.println(itemName + "을 고객이 사갔습니다.");
                } else {
                    System.err.println("판매 물품 수량 부족");
                }

                break;
            }
        }

        consumers.release();
    }

    public boolean ableToEnterConsumer() {
        return consumers.tryAcquire();
    }

    public Semaphore getProducers() {
        return producers;
    }

    public Semaphore getConsumers() {
        return consumers;
    }

    public ThreadGroup getConsumersThreadGroup() {
        return consumersThreadGroup;
    }

    public ThreadGroup getProducersThreadGroup() {
        return producersThreadGroup;
    }
}
