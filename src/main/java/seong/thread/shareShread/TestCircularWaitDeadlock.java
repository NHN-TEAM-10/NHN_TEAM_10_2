package seong.thread.shareShread;

public class TestCircularWaitDeadlock {
    public static void main(String[] args) {
        Object resource1 = new Object();
        Object resource2 = new Object();

        Thread task1 = new Thread(()-> {
            synchronized (resource1) {
                try{
                    Thread.sleep(1000);
                    System.out.println("Task 1가 resource1 점유중");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            synchronized (resource2){
                System.out.println("Task 1가 resource2 점유중");
            }

        });

        Thread task2 = new Thread(()-> {
            synchronized (resource2) {
                try {
                    System.out.println("Task 2가 resource2 점유중");
                    Thread.sleep(10000);

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            synchronized (resource1) {
                System.out.println("Task 2가 resource1 점유중");
            }
        });

        task1.start();
        task2.start();
    }
}
