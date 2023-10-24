package young.thread.practice;

public class NHNStore {
    public static void main(String[] args) {
        Store store = new Store();

        for (int i = 0; i < 5; i++) {
            Thread consumer = new Thread(new Consumer("123", store));
            consumer.start();
        }
    }
}
