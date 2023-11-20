package seong.course3;

public class Exercise2 {
    // 가장 많은 약수 개수
    // 가장 많은 약수를 가지고 있는 숫자
    // 1~ 10000까지 반복
    // 각 숫자의 약수 구하기 약수 개수, 약수 숫자 갱신하기
    // 출력



    public static void main(String[] args) {
        int number = 0;
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
                number = i;
            }
        }
        System.out.println(number + "가 " + maxMeasure + "개 의 약수를 가지고있습니다.");
    }


}
