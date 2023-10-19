package yang.Thread;

public class Counter {
    String name;
    int count;

    public Counter(String name, int count ){
        this.name=name;
        this.count=count;
    }
    public void run() throws InterruptedException {

            for (int i = 0; i < count; i++) {
                System.out.println(name+" : "+i);
                Thread.sleep(1000);
            }


    }


}
