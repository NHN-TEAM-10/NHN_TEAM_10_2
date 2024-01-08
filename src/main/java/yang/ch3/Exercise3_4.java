package yang.ch3;

import java.util.Scanner;

public class Exercise3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String problem = sc.nextLine();
        String result= "";
        for (int i = 0; i < problem.length(); i++) {
           char ch = problem.charAt(i);
           if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')||ch==' '||ch=='\''){
               result+=ch;
           }
        }
        String [] problemArray = result.split(" ");
        for (int i = 0; i < problemArray.length; i++) {
            System.out.println(problemArray[i]);

        }
    }
}
