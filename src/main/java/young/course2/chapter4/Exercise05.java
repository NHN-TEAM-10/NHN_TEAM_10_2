package young.course2.chapter4;

/*
This exercise asks you to write a few lambda expressions and a function that returns a lambda expression as its value.
Suppose that a function interface ArrayProcessor is defined as

public interface ArrayProcessor {
    double apply( double[] array );
}
Write a class that defines four public static final variables of type ArrayProcessor that process an array in the following ways:
find the maximum value in the array, find the minimum value in an array, find the sum of the values in the array, and find the average of the values in the array.
In each case, the value of the variable should be given by a lambda expression. The class should also define a function

public static ArrayProcessor counter( double value ) { ...
This function should return an ArrayProcessor that counts the number of times that value occurs in an array. The return value should be given as a lambda expression.

The class should have a main() routine that tests your work.
The program that you write for this exercise will need access to the file ArrayProcessor.java, which defines the functional interface.
 */

public class Exercise05 {
    public static double max;
    public static double min;
    public static double sum;
    public static double aver;

    public static double sumProcessor(double[] arr) {
        ArrayProcessor sumArrProcessor = (A) -> {
            double res = 0;
            for (double number : A) {
                res += number;
            }

            return res;
        };

        return sumArrProcessor.apply(arr);
    }

    public static double averProcessor(double[] arr) {
        ArrayProcessor averArrProcessor = (A) -> {
            double res = 0;
            for (double number : A) {
                res += number;
            }

            return res / arr.length;
        };

        return averArrProcessor.apply(arr);
    }

    public static double maxProcessor(double[] arr) {
        ArrayProcessor maxArrProcessor = (A) -> {
            double res = Double.MIN_VALUE;
            for (double number : A) {
                if (number > res) {
                    res = number;
                }
            }

            return res;
        };

        return maxArrProcessor.apply(arr);
    }

    public static double minProcessor(double[] arr) {
        ArrayProcessor minArrProcessor = (A) -> {
            double res = Double.MAX_VALUE;
            for (double number : A) {
                if (number < res) {
                    res = number;
                }
            }

            return res;
        };

        return minArrProcessor.apply(arr);
    }

    public static void main(String[] args) {
        double[] array = {1.0, 2.0, 3.0, 4.0};
        Exercise05.sum = sumProcessor(array);
        Exercise05.aver = averProcessor(array);
        Exercise05.max = maxProcessor(array);
        Exercise05.min = minProcessor(array);

        System.out.println("sum: " + sum);
        System.out.println("aver: " + aver);
        System.out.println("max: " + max);
        System.out.println("min: " + min);

    }
}
