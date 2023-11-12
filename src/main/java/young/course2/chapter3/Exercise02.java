package young.course2.chapter3;

/*
Which integer between 1 and 10000 has the largest number of divisors, and how many divisors does it have? Write a program to find the answers and print out the results.
It is possible that several integers in this range have the same, maximum number of divisors.
Your program only has to print out one of them. An example in Subsection 3.4.2 discussed divisors.
The source code for that example is CountDivisors.java.

You might need some hints about how to find a maximum value.
The basic idea is to go through all the integers, keeping track of the largest number of divisors that you've seen so far.
Also, keep track of the integer that had that number of divisors.
 */

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int divisorCount = 0;
        int maxDivisorNumber = 0;

        for (int testDivisor = 1; testDivisor <= 10000; testDivisor++) {
            int count = 0;
            for (int number = 1; number <= testDivisor; number++) {
                if (testDivisor % number == 0) {
                    count++;
                }
            }

            if (count >= divisorCount) { // 더 큰 수를 선정하기 위해서 >=
                divisorCount = count;
                maxDivisorNumber = testDivisor;
            }
        }
    }
}
