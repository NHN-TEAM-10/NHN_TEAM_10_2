package seong.course3;

public class Exercise7_1 {
    public static void main(String[] args) {
        /**
         * Simulate choosing people at random and checking the day of the year they
         * were born on.  If the birthday is the same as one that was seen previously,
         * stop, and output the number of people who were checked.
         */

        int[] used;  // For recording the possible birthdays
        //   that have been seen so far.  A value
        //   of true in used[i] means that a person
        //   whose birthday is the i-th day of the
        //   year has been found.

        int count;       // The number of people who have been checked.

        used = new int[365];  // Initially, all entries are false.

        count = 0;

        while (true) {
            // Select a birthday at random, from 0 to 364.
            // If the birthday has already been used, quit.
            // Otherwise, record the birthday as used.

            int birthday;  // The selected birthday.
            birthday = (int) (Math.random() * 365);
            count++;

            System.out.printf("Person %d has birthday number %d%n", count, birthday);

            if (used[birthday] >= 3) {
                // This day was found before; It's a duplicate.  We are done.
                break;
            }

            used[birthday]++;

        } // end while

        System.out.println();
        System.out.println("A duplicate birthday was found after "
                + count + " tries.");
    }

} // end class BirthdayProblem

