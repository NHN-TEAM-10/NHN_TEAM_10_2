package seong.course3;

import java.util.Random;

public class Exercise1 {
    public static void main(String[] args) {
        //주사위 한 쌍을 몇 번이나 굴려야 뱀의 눈(snake eyes)이 뜰까? 주사위를 손으로 굴려서 실험을 할 수도 있을 것이다. 해당 실험을 시뮬레이션하는 컴퓨터 프로그램을 작성하라. 이 프로그램은 주사위가 뱀의 눈으로 나타나기 전까지 시행된 굴림 횟수(the number of rolls)를 보고해야 한다. (주: "뱀의 눈"은 두 주사위가 모두 1의 값을 보임을 의미한다.) 연습문제 2.2에서 주사위 한 쌍에 관한 굴리기 시뮬레이션 방법을 설명했다.

        // 2개의 정수가 1 1이 될때 까지 반복
        // 중간에 Count가 필요함
        Random random = new Random();
        int dice1 = 0;
        int dice2 = 0;
        int count = 0;
        while (true) {
            count++;
            dice1 = random.nextInt(6) + 1;
            dice2 = random.nextInt(6 ) +1;
            if (dice1 == 1 && dice2 == 1) {
                System.out.println(count + "회 반복하였습니다.");
                break;
            }
        }
    }
}
