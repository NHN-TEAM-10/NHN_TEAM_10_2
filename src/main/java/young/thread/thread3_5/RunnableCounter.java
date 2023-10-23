package young.thread.thread3_5;

public class RunnableCounter implements Runnable {
    private int maxCount;
    private String name;
    private int number;
    private boolean flagStop;

    public RunnableCounter(String name, int maxCount) {
        this.name = name;
        this.maxCount = maxCount;
        this.number = 1;
        flagStop = false;
    }

    public void setFlagStopTrue() {
        this.flagStop = true;
    }

//    @Override
//    public void run() { // flag stop
//        if (number > maxCount) {
//            setFlagStopTrue();
//        }
//
//        while (!flagStop) {
//            System.out.println(name + " : " + number);
//            number++;
//
//            try {
//                Thread.sleep(250);
//            } catch (InterruptedException e) {
//                e.getStackTrace();
//            }
//
//            if (number > maxCount) {
//                setFlagStopTrue();
//            }
//        }
//    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            if (number > maxCount) {
                Thread.currentThread().interrupt();
            } else {
                System.out.println(name + " : " + number);
                number++;
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    e.getStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableCounter("runnableCounter", 10));
        thread.start();
    }
}
