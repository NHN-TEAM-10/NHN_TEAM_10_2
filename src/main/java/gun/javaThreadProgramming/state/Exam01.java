package gun.javaThreadProgramming.state;

public class Exam01 {
    public static void main(String[] args) {
        Thread thread = new Thread();

        System.out.println(thread.getState());
    }
}
