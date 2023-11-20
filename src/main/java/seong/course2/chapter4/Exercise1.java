package seong.course2.chapter4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * 문자열의 각단어 첫글자를 대문자로 변환하는 프로그램 preCondition : 문자를 가진 문자열을 입력해야함.
 */
public class Exercise1 {
    public static void main(String[] args) {
        // 문자열을 입력받는다.
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        // 각 단어의 첫글자를 대문자로 변경
        // printCapitalized()
        System.out.println(printCapitalized(line));
    }

    /**
     * 각 단아의 첫글자를 대문자로 변경한다
     * preCondition 각 단어의 첫글자가 문자인 문자열
     * postCondition 각 단어의 첫글자가 대문자인 문자열
     */
    private static String printCapitalized(String line) {
        //  문자열을 나눈다
        //  각 단어의 첫글자를 대문자로 변경한다
        //  문자열을 붙인다.
        String[] newLine = line.split(" ");
        //첫문자가 문자가 아니면 기존 문자열 반환
        for (String s : newLine) {
            if (!Character.isLetter(s.charAt(0))) {
                return line;
            }
        }
        return Arrays.stream(newLine).map(word -> Character.toUpperCase(word.charAt(0)) + word.substring(1)).collect(
                Collectors.joining(" "));

    }
}
