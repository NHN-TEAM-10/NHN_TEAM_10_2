package seong.course2.chapter8;

import java.util.Scanner;

/**
 * 사용자가 표현식을 입력할수 있는 프로그램 Expr을 사용. 사용자는 원하는만큼 x의 값을 입력한다.
 */
public class Exercise4 {

    /**
     * Expr을 사용하여 사용자에게 표현식을 입력받음 precondition : 표현식은 +, -, /, ^,sin,cos,abs,ln 연산자를 사용할수있음. 이외는
     * IllegalArgumentException
     */
    public static void writeExpression() {
        /**
         * while (true)
         *  사용자 입력 받기
         *  입력이 비어있으면
         *      break
         *   입력을 Expr로 변환
         *   read and procss the user's numbers
         *
         */

        /**
         * while(true)
         *  사용자 입력받기
         *  입력이 비어있으면
         *      break
         *  try{
         *      new Expr(입력)
         *  }catch(IllegalArgumentException e){
         *      에러메시지 출력
         *      continue
         *  }
         *  read and procss the user's numbers
         */

        /**
         while(true)
         *  사용자 입력받기
         *  입력이 비어있으면
         *      break
         *  try{
         *      new Expr(입력)
         *  }catch(IllegalArgumentException e){
         *      에러메시지 출력
         *      continue
         *  }
         *  if val is Double.NaN{
         *      에러 미시지 출력
         *  }else{
         *      output val
         *  }
         */
        Scanner sc = new Scanner(System.in);
        boolean writeXAgain = false;
        // 사용자 표현식입력 - 유효하지 않은경우 에러처리

        //사용자 x값 입력 - 유효하지 않은경우 에러처리

        while (true) {
            System.out.println("표현식을 입력하세요");
            String expression = sc.next();
            if (expression.isEmpty()) {
                break;
            }
            Expr expr;
            try {
                expr = new Expr(expression);
            } catch (IllegalArgumentException e) {
                System.out.println(e);
                System.out.println("다시입력하세요.");
                continue;
            }
            while (true) {
                System.out.println("x값을 입력하세요.");
                String line = sc.next();
                if (line.isEmpty()) {
                    break;
                }
                double number;

                try {
                    number = Double.parseDouble(line);
                } catch (NumberFormatException e) {
                    System.out.println("올바른 값을 입력하세요");
                    continue;
                }
                double result = expr.value(number);
                if (Double.isNaN(result)) {
                    System.out.println("잘못된 결과값입니다.");
                } else {
                    System.out.println(result);
                }
            }
            System.out.println("표현식을 다시 입력하시겠습니까?");
        }


    }

    public static void main(String[] args) {
        writeExpression();
    }
}
