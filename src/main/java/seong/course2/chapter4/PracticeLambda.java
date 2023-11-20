package seong.course2.chapter4;


public class PracticeLambda {

    public interface SupplyInt {
        public int get();
    }

    public static int randomInteger(SupplyInt sInt) {
        return sInt.get();
    }

    public static void main(String[] args) {
        System.out.println(
                randomInteger(() -> (int) (Math.random() * 6)) + 1
        );

    }
}
