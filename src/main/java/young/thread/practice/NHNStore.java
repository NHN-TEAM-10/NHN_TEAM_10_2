package young.thread.practice;

public class NHNStore {
    public static void main(String[] args) throws InterruptedException {
        Store store = new Store();
        Thread producer = new Thread(new Producer(store));
        producer.start();

        for (int i = 1; i <= 3; i++) {
            Thread.sleep(1000);
            String consumerName = "Consumer_" + i;
            Thread consumer = new Thread(new Consumer(consumerName, store));
//            consumer.start();
        }

        store.stop();
    }
}