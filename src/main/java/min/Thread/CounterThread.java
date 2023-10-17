package min.Thread;

public class CounterThread extends Thread{
    String name;
    int count;

    public CounterThread(String name){
        this.name = name;
    }

    public void run() {
        while (!Thread.interrupted()) {
           try{
               Thread.sleep(1000);
               System.out.println(name +" : " + count++);


           }catch (InterruptedException e){
               throw new RuntimeException(e);
           }
        }
    }
}
