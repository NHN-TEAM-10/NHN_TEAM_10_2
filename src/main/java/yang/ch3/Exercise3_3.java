package yang.ch3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Exercise3_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        double num =Double.parseDouble(st.nextToken());
        String operator= st.nextToken();
        double num2 =Double.parseDouble(st.nextToken());
        st.nextToken();
        double result = Double.parseDouble(st.nextToken());
        double result1;

        switch (operator){
            case "+":
                result1=num+num2;
                break;
            case "-":
                result1=num-num2;
                break;
            case "*":
                result1=num*num2;
                break;
            default:
                result1=num/num2;
        }
        if(result1==result){
            System.out.println("정답입니다.");
        }else{
            System.out.println("틀렸습니다.");
        }
    }
}
