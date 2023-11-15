package young.course2.chapter4;

/*
Same explanation with Exercise05

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

public class Exercise05_2 {
    public static double max;
    public static double min;
    public static double sum;
    public static double aver;

    public static double calc(MyProcessor processor, double[] numbers) {
        double res = numbers[0];

        for (int index = 1; index < numbers.length; index++) {
            res = processor.apply(res, numbers[index]);
        }

        return res;
    }

    public static void main(String[] args) {
        double[] array = {1.0, 2.0, 3.0, 4.0};

        Exercise05_2.sum = calc((x, y) -> x + y, array);
        Exercise05_2.aver = calc((x, y) -> x + y, array) / array.length;
        Exercise05_2.max = calc((x, y) -> x > y ? x : y, array);
        Exercise05_2.min = calc((x, y) -> x < y ? x : y, array);

        System.out.println("sum: " + Exercise05_2.sum);
        System.out.println("aver: " + Exercise05_2.aver);
        System.out.println("max: " + Exercise05_2.max);
        System.out.println("min: " + Exercise05_2.min);

    }
}
