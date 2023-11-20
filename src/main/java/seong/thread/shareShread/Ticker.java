package seong.thread.shareShread;

public class Ticker extends Thread {
    private int miliseconds;
    private int nanoseconds;

    public Ticker(String milisecond) {
        if (milisecond.endsWith("n")) {
            String nanoSecond = milisecond.substring(0, milisecond.length() - 2);
            this.miliseconds = 0;
            this.nanoseconds = Integer.parseInt(nanoSecond);
        } else {
            this.miliseconds = Integer.parseInt(milisecond);
            this.nanoseconds = 0;
        }

    }

    @Override
    public void run() {
        while (true) {
            try {
                long currentTime = System.currentTimeMillis();
                if (this.miliseconds == 0) {
                    Thread.sleep(0, this.nanoseconds);
                    System.out.println("tick");
                } else {
                    Thread.sleep(this.miliseconds, 0);
                    System.out.println("tick");
                }
                System.out.println(System.currentTimeMillis() - currentTime);


            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
