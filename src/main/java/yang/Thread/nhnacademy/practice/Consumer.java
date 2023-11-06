package yang.Thread.nhnacademy.practice;


public class Consumer implements Runnable {
    Thread thread;
    Store store;
    String name;

    public Consumer(Store store, String name) {
        thread = new Thread(this, name);
        this.store = store;
        this.name = name;
    }


    @Override
    public void run() {
        store.enter(this);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }

        store.buy(this);
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){

        }

        store.exit(this);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
    }


    public void start() {
        thread.start();
    }

}
