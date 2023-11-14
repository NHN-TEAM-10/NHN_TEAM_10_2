package young.thread.thread7.quiz01;

public class Ticker extends Thread {
    private int interval;
    private boolean isNanoSecond;

    public Ticker(String name, String intervalString) {
        super(name);

        if (intervalString.charAt(intervalString.length() - 1) == 'n') {
            isNanoSecond = true;
            this.interval = Integer.parseInt(intervalString.substring(0, intervalString.length() - 1));
        } else {
            isNanoSecond = false;
            this.interval = Integer.parseInt(intervalString);
        }
    }

    @Override
    public void run() {
        int count = 0;

        while (count < 10) {
            System.out.println(Thread.currentThread().getName());
            try {
                if (isNanoSecond) {
                    Thread.sleep(0, interval);
                } else {
                    Thread.sleep(interval);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            count++;
        }
    }
}
