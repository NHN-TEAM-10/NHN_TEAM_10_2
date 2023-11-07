package seong.course3;

public class Exercise7_2 {
    public static void main(String[] args) {
        /**
         * Simulate choosing people at random and checking the day of the year they
         * were born on.  If the birthday is the same as one that was seen previously,
         * stop, and output the number of people who were checked.
         */

        boolean[] used;  // For recording the possible birthdays
        //   that have been seen so far.  A value
        //   of true in used[i] means that a person
        //   whose birthday is the i-th day of the
        //   year has been found.

        // The number of people who have been checked.

        used = new boolean[365];  // Initially, all entries are false.

        for (int i = 0; i < 365; i++) {
            int birthday;  // The selected birthday.
            birthday = (int) (Math.random() * 365);
            used[birthday] = true;
        }
        int count;
        count = 0;
        for (int i = 0; i < used.length; i++) {
            if (used[i]) {
                count++;
            }
        }
        System.out.println(count);

    }
}
