package gun.javaThreadProgramming;

public class Counter{
    String name;
    int count;

    public Counter(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public void run() {
        try {
            while (count<10) {
                System.out.println(name+" : "+count++);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }


    public static void main(String[] args) {
        Counter counter1 = new Counter("Thread",0);
        counter1.run();
        Counter counter2 = new Counter("Thread",0);
        counter2.run();

        System.out.println("Thread가 중단되었습니다.");
    }
}
