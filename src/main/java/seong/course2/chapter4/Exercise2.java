package seong.course2.chapter4;


import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        // 16진수를 입력받는다 - 16진수가 아닌 값이 있으면 throw error
        Scanner sc = new Scanner(System.in);
        String hex = sc.nextLine();
        if (!hex.matches("[0-9a-fA-F]+")) {
            throw new NumberFormatException("16진수 값을 입력하세요");
        }
        int value = 0;
        for (int i = 0; i < hex.length(); i++) {
            value = value * 16 + hexValue(hex.charAt(i));
        }
        System.out.println(value);
        // 모든 자릿수 순회하며 10진수로 값을 변환
        // 모든 자릿수 순환
        // 10진수로 바꾸기.
    }

    /**
     * 한자리의 16진수를 10진수의 값으로 변환해준다.
     * precondition : 0-9, a-f인 문자열
     * postcondition : 입력된 문자가 10진수로 변환된 값.
     * @param c
     * @return
     */
    private static int hexValue(char c) {
        int result;
        switch (c) {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                result = Integer.parseInt(String.valueOf(c));
                break;
            case 'A':
                result = 10;
                break;
            case 'B':
                result = 11;
                break;
            case 'C':
                result = 12;
                break;
            case 'D':
                result = 13;
                break;
            case 'E':
                result = 14;
                break;
            case 'F':
                result = 15;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + c);
        }
        return result;
    }
}
