package seong.course2.chapter5;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise7 {
    private static final int QUIZ_SIZE = 10;
    private static int[] userAnswer;

    private static final ArrayList<IntQuestion> question = new ArrayList<>();

    public static void main(String[] args) {
        // 퀴즈를 생성 - 10가지 간단한 덧셈 문제 만들기
        makeQuiz();
        // 퀴즈 관리 - 사용자에게 quiz 질문 받기, answer 저장
        manageQuiz();
        // 퀴즈 채점 - quiz 채점.
        grading();
    }

    /**
     * 퀴즈를 채점하고, 문제 정답을 출력, 점수를 공개한다. precondition : quiz배열 2개와 사용자의 입력을 저장한 answer배열이 quizSize만큼 값을 가지고 있어야 한다.
     * postcondition : quiz 결과를 출력한다.
     */
    private static void grading() {
        int score = 0;
        // 같으면 점수 추가
        System.out.println("---------------채점중----------------");
        for (int i = 0; i < QUIZ_SIZE; i++) {
            int quizAnswer = question.get(i).getCorrectAnswer();
            if (quizAnswer == userAnswer[i]) {
                score++;
                System.out.println(i + "번 문제 정답입니다.");
            } else {
                System.out.println(i + "번 문제 오답입니다. 정답은 :" + quizAnswer);
            }
        }
        // 문제와 답 공개
        System.out.println("---------------정답지----------------");
        for (int i = 0; i < QUIZ_SIZE; i++) {
            int quizAnswer = question.get(i).getCorrectAnswer();
            System.out.println(question.get(i).getQuestion() + quizAnswer);
        }

        // 점수 공개
        System.out.println("---------------채점결과----------------");
        System.out.println(score + "점 입니다!");
    }

    /**
     * 퀴즈를 관리한다. 사용자에게 quiz를 제공, 사용자의 answer를 저장한다 precondition : quizSize만큼 값이 저장된 2개 정수 배열, answer를 저장할 정수 배열이 필요하다.
     * postcondition : user의 answer가 배열형태로 저장된다.
     */
    private static void manageQuiz() {
        Scanner sc = new Scanner(System.in);
        userAnswer = new int[QUIZ_SIZE];
        // 퀴즈 생성한거 출력
        // 사용자 입력, answer 배열에 저장
        for (int i = 0; i < QUIZ_SIZE; i++) {
            System.out.println(question.get(i).getQuestion());
            userAnswer[i] = sc.nextInt();
            System.out.println();
        }
    }

    /**
     * 퀴즈를 생성한다.
     */
    private static void makeQuiz() {
        for (int i = 0; i < QUIZ_SIZE; i++) {
            question.add(new minusQuestion());
        }
    }

}