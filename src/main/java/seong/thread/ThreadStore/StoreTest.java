package seong.thread.ThreadStore;

import java.util.concurrent.Semaphore;

public class StoreTest {
    public static void main(String[] args) throws InterruptedException {
        Store store = new Store();

        for (int i = 0; i < 2; i++) {
            Seller seller = new Seller(store);
            seller.start();
        }

        for (int i = 0; i < 5; i++) {
            Buyer buyer = new Buyer( String.valueOf(i), store);
            buyer.start();
        }
    }
}
