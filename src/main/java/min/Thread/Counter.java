package min.Thread;

public class Counter extends Thread{
    String name;
    int count;

    public Counter(String name){
        this.name = name;
    }

    public void run(){
        while (!Thread.interrupted()) {
            try{
                Thread.sleep(1000);
                System.out.println(name + " : " + count++);


            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }

}
