package yang.Thread;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class MyThread extends Thread{
    public void run(){/*작업내용*/} // Thread클래스의 run()을 오버라이딩

}

class NyThread implements Runnable{
    public void run(){/*작업내용*/} // Runnable interface run() 구현
}

