package young.thread.thread7.quiz01;

public class Quiz01 {
    public static void main(String[] args) {
        Ticker ticker = new Ticker("tick", "500");
        Ticker nanoTicker = new Ticker("tick", "500n");
        ticker.start();
    }
}
