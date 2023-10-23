package seong.thread.shareShread;

public class Ticker extends Thread {
    private int miliseconds;

    public Ticker(String milisecond) {
        if (milisecond.endsWith("n")) {
            milisecond = milisecond.substring(0, milisecond.length() - 2);
            this.miliseconds = Integer.parseInt(milisecond) / 1000;
        }
        this.miliseconds = Integer.parseInt(milisecond);
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(this.miliseconds);

                System.out.println("tick");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
