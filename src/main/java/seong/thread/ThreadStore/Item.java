package seong.thread.ThreadStore;

public class Item extends Thread{
    private final String name;
    private int count;


    public Item(String name) {
        this.name = name;
        this.count = 0;
    }

    public void increaseCount() {
        this.count++;
    }
}
