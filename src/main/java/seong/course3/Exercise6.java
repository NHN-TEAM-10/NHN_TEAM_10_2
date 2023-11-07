package seong.course3;

public class Exercise6 {
    public static void main(String[] args) {
        int maxMeasure = 0;
        for (int i = 1; i <= 10000; i++) {
            int measureCount = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    measureCount++;
                }
            }
            if (maxMeasure < measureCount) {
                maxMeasure = measureCount;
            }
        }

        final int possibleMaxArrayLength = 10000;
        int[] numberArray = new int[possibleMaxArrayLength];
        int index = 0;

        for (int i = 1; i <= 10000; i++) {
            int measureCount = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    measureCount++;
                }
            }
            if (maxMeasure == measureCount) {
                numberArray[index] = i;
                index++;
            }
        }

        System.out.println("1과 10000 사이의 정수 중에서,");
        System.out.println("약수의 최대 갯수는 64");
        System.out.println("이러한 약수의 갯수를 가진 숫자들은:");
        for (int i = 0; i < index; i++) {
            System.out.println(numberArray[i]);
        }

    }
}
