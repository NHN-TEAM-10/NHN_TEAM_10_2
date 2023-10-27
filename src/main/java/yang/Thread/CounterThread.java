package yang.Thread;

public class CounterThread extends Thread {
    String name;
    int count=10;

    public CounterThread(String name){
        this.name= name;
    }
    public void run(){
        while(!Thread.interrupted()){
            for (int i = 0; i < count; i++) {
                System.out.println(name+" : "+i);
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
