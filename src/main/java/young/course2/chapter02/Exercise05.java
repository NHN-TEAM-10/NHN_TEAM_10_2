package young.course2.chapter02;

public class Exercise05 {
    public static void main(String[] args) {
        int eggs = 1342;
        int gross = eggs / 144;
        int dozen = (eggs % 144) / 12;
        int remain = eggs % 12;

        System.out.println("Your number of eggs is " + gross + " gross, " + dozen + " dozen, and " + remain);
    }
}
