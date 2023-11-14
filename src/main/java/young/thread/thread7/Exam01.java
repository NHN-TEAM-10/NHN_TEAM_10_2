package young.thread.thread7;

public class Exam01 extends Thread {
    public static void main(String[] args) {
        Thread thread = new Thread("new Thread");
        System.out.println(thread.getState());
    }
}
