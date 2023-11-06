package gun.javaThreadProgramming.practice;

public class Main {
    public static void main(String[] args) {
        Store store = new Store("옷가게");
        String [] consumerNames = {"강건", "김영웅", "양대열", "김성현", "박승민", "박경서(TA)", "김종명(TA)", "김재우(NHN ACADEMY, 학장)", "김판구(교수)","지나가던 행인"};

        // 소비자 스레드 시작
        for (String consumerName : consumerNames) {
            Consumer consumer = new Consumer(consumerName, store);
            Thread consumerThread = new Thread(consumer);
            consumerThread.start();
        }

        // Producer 스레드 시작
        Producer producer = new Producer(store);
        Thread producerThread = new Thread(producer);
        producerThread.start();

        // 메인 스레드를 실행 중으로 유지
        try {
            producerThread.join();
            for (String consumerName : consumerNames) {
                Thread.currentThread().join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("옷가게 문 닫힘");
    }
}
