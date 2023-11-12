package seong.course2.chapter4;

import java.lang.reflect.Array;

/**
 * 배열을 처리하는 ArrayProcessor로 배열의 최대값, 최소값, 배열의 합, 평균을 return하는 4개의 method 포함
 */
public class Exercise5 {

    /**
     * 배열 내부에 매개변수 Value와 같은 값의 개수를 반환하는 method
     * @param value 는 유효한 double 값이다.
     * @return value와 같은 값의 개수
     */
    public static ArrayProcessor counter(double value) {
        return (array -> {
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == value) {
                    count++;
                }
            }
            return count;
        });
    }

    /**
     * 배열의 최대값을 return하는 method
     * array는 최소 길이가 1이다.
     * @return ArrayProcess 타입의 배열의 maxValue를 구하는 lambda expression
     */
    public static ArrayProcessor maxValueInArray(){
        return (array -> {
            double max = array[0];
            for (int i = 1; i < array.length; i++) {
                if(max < array[i]){
                    max = array[i];
                }
            }
            return max;
        });
    }
    /**
     * 배열의 최소값을 return하는 method
     * array는 최소 길이가 1이다.
     * @return ArrayProcess 타입의 배열의 minValue를 구하는 lambda expression
     */
    public static ArrayProcessor minValueInArray(){
        return (array -> {
            double min = array[0];
            for (int i = 1; i < array.length; i++) {
                if(min > array[i]){
                    min = array[i];
                }
            }
            return min;
        });
    }

    /**
     * 배열 요소의 합을 return 하는 method
     * precondition : 배열의 최소 길이는 1이다.
     * @return ArrayProcess 타입의 배열 요소의 sum을 구하는 lambda expression
     */
    public static ArrayProcessor sumInArray(){
        return (array -> {
            double sum = 0;
            for (double v : array) {
                sum += v;
            }
            return sum;
        });
    }

    public static ArrayProcessor averageInArray(){
        return (array -> sumInArray().apply(array)/ array.length);
    }

    public static void main(String[] args) {
        double[] arr = {1, 2, 3, 4, 5};
        System.out.println(maxValueInArray().apply(arr));
        System.out.println(minValueInArray().apply(arr));
        System.out.println(sumInArray().apply(arr));
        System.out.println(averageInArray().apply(arr));

    }
}
