package seong.thread.thread_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exam01 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++) {
            executor.submit(new Worker("Worker" + i));
        }

        // 이전에 실행되던 작업은 종료를 기다려줌
        executor.shutdown();
        while (!executor.isTerminated()) {

        }
        System.out.println("모든 작업이 종료 됐습니다");
    }
}
