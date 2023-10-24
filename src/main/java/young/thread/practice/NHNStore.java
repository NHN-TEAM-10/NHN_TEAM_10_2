package young.thread.practice;

public class NHNStore {
    public static void main(String[] args) {
        ThreadGroup tg;
        Store store = new Store();

        Thread producer = new Thread(new Producer(store));
        producer.start();

        for (int i = 1; i <= 3; i++) {
            tg = store.getConsumers();

            if (tg.activeCount() < 5) {
                String consumerName = "Consumer_" + i;
                Thread consumer = new Thread(tg, new Consumer(consumerName, store));
                consumer.start();
                store.enter(consumer);
            } else {
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException ignore) {
                }
                System.err.println("마트에 인원이 가득찼습니다. 4초간 대기합니다.");
                i--;
            }
        }

        while (true) {
            if (store.getConsumers().activeCount() == 0) {
                break;
            }
        }
        producer.stop();
        System.out.println("마트 영업시간이 종료됐습니다.");
    }
}