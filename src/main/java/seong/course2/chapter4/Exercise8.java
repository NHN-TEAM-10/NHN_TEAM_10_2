package seong.course2.chapter4;

import java.util.Scanner;

/**
 * 덧셈 퀴즈를 관리하는 프로그램
 */
public class Exercise8 {
    private static final int QUIZ_SIZE = 10;
    private static int[] firstQuiz;
    private static int[] secondQuiz;
    private static int[] userAnswer;

    public static void main(String[] args) {
        // 퀴즈를 생성 - 10가지 간단한 덧셈 문제 만들기
        makeQuiz();
        // 퀴즈 관리 - 사용자에게 quiz 질문 받기, answer 저장
        manageQuiz();
        // 퀴즈 채점 - quiz 채점.
        grading();
    }

    /**
     * 퀴즈를 채점하고, 문제 정답을 출력, 점수를 공개한다.
     * precondition : quiz배열 2개와 사용자의 입력을 저장한 answer배열이 quizSize만큼 값을 가지고 있어야 한다.
     * postcondition : quiz 결과를 출력한다.
     */
    private static void grading() {
        int score = 0;
        // 같으면 점수 추가
        System.out.println("---------------채점중----------------");
        for (int i = 0; i < QUIZ_SIZE; i++) {
            int quizAnswer = firstQuiz[i] + secondQuiz[i] ;
            if (quizAnswer == userAnswer[i]) {
                score++;
                System.out.println(i + "번 문제 정답입니다.");
            }else{
                System.out.println(i + "번 문제 오답입니다. 정답은 :" +quizAnswer );
            }
        }
        // 문제와 답 공개
        System.out.println("---------------정답지----------------");
        for (int i = 0; i < QUIZ_SIZE; i++) {
            int quizAnswer = firstQuiz[i] + secondQuiz[i] ;
            System.out.println(firstQuiz[i] + " + " + secondQuiz[i] + " = " + quizAnswer);
        }

        // 점수 공개
        System.out.println("---------------채점결과----------------");
        System.out.println(score + "점 입니다!");
    }

    /**
     * 퀴즈를 관리한다. 사용자에게 quiz를 제공, 사용자의 answer를 저장한다
     * precondition : quizSize만큼 값이 저장된 2개 정수 배열, answer를 저장할 정수 배열이 필요하다.
     * postcondition : user의 answer가 배열형태로 저장된다.
     */
    private static void manageQuiz() {
        Scanner sc = new Scanner(System.in);
        userAnswer = new int[QUIZ_SIZE];
        // 퀴즈 생성한거 출력
        // 사용자 입력, answer 배열에 저장
        for (int i = 0; i < QUIZ_SIZE; i++) {
            System.out.print(firstQuiz[i] + " + " + secondQuiz[i] + " = ");
            userAnswer[i] = sc.nextInt();
            System.out.println();
        }
    }

    /**
     * 퀴즈를 생성한다.
     * precondition : 2개의 int[]가 필요하다.
     * postcondition : quizSize 만큼의 정수가 담긴 2 int[]가 생성된다.
     */
    private static void makeQuiz() {
        // 각 배열의 요소마다 랜덤한 값 추가
        firstQuiz = new int[QUIZ_SIZE];
        secondQuiz = new int[QUIZ_SIZE];

        for (int i = 0; i < QUIZ_SIZE; i++) {
            firstQuiz[i] = (int) (Math.random() * 100);
            secondQuiz[i] = (int) (Math.random() * 100);
        }
    }

}
