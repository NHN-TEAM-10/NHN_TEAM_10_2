package gun.practice2;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        String[] consumerNames = {"강건", "김영웅", "양대열", "김성현", "박승민", "박경서(TA)", "김종명(TA)", "김재우(NHN ACADEMY, 학장)", "김판구(교수)", "지나가던 행인"};
        Consumer[] consumers = new Consumer[consumerNames.length];
        Thread[] consumerThreads = new Thread[consumerNames.length];

        Producer producer = new Producer(store);
        Thread producerThread = new Thread(producer);

        producerThread.start();

        for (int i = 0; i < consumerNames.length; i++) {
            consumers[i] = new Consumer(consumerNames[i], store);
            consumerThreads[i] = new Thread(consumers[i]);
            consumerThreads[i].start();
        }

        try {
            producerThread.join();
            for (Thread thread : consumerThreads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
