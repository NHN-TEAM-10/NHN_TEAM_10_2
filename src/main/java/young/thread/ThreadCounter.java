package young.thread;

import static java.lang.Thread.sleep;

public class ThreadCounter extends Thread{
    private int number;
    private String name;
    private int maxNumber;

    public ThreadCounter(String name, int maxNumber) {
        this.name = name;
        this.maxNumber = maxNumber;
        this.number = 1;
    }

    @Override
    public void run(){
        for (int i = 0; i < maxNumber; i++) {
            System.out.println(name + " : " + number);
            number++;
            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        ThreadCounter counter = new ThreadCounter("threadCounter", 10);
        counter.run();
    }
}
