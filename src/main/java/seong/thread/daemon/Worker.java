package seong.thread.daemon;

import seong.thread.thread_pool.RunnableCounter;

public class Worker extends RunnableCounter {
    RunnableCounter runnableCounter;

    public Worker(String name, int maxCount) {
        super(name, maxCount);
        runnableCounter = new RunnableCounter("InternalWorker", maxCount);
        runnableCounter.setDaemon(true);
    }

    @Override
    public void run(){
        runnableCounter.run();
        super.run();
    }
}
