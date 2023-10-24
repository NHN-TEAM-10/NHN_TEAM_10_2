package yang.Thread.nhnacademy.practice;

public class Producer implements Runnable{
    Thread thread;

    Store store;
    public Producer(Store store){
        thread = new Thread(this);
        this.store = store;
    }

    @Override
    public void run() {
        while(true){
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){

            }
            store.sell();
        }


    }

    public void start() {
        thread.start();
    }

    public void interrupt() {
        thread.interrupt();
    }

    public void setDaemon(boolean b) {
        thread.setDaemon(true);
    }
}
