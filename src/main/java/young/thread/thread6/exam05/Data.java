package young.thread.thread6.exam05;

public class Data {
    private String packet;
    private boolean transfer = true; // true -> receiver wait / false -> sender wait

    public synchronized void send(String packet) {
        while (!transfer) { // false -> sender wait.
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Thread interrupted in Data Class");
            }
        }
        transfer = false;

        this.packet = packet;
        notifyAll();
    }

    public String receive() {
        while (transfer) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Thread Interrupted in Data Class receive method");
            }
        }

        transfer = true;

        String returnPacket = this.packet;
        notifyAll();
        return returnPacket;
    }
}
