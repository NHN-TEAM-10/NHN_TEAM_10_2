package young.course2.chapter3;

import java.util.Scanner;

public class Exercise06 {
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

        System.out.println("1과 10000 사이의 정수 중에서 약수의 최대 갯수는: " + maxDivisorNumber);
        System.out.println("이러한 약수의 갯수를 가진 숫자들은: ");

        for (int testDivisor = 1; testDivisor <= 10000; testDivisor++) {
            int count = 0;
            for (int number = 1; number <= testDivisor; number++) {
                if (testDivisor % number == 0) {
                    count++;
                }
            }

            if (count == divisorCount) {
                System.out.println(testDivisor);
            }
        }
    }
}
