package seong.course3;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letters = "He said, That's not a good idea.";

        for (int i = 0; i < letters.length(); i++) {
            if(Character.isLetter(letters.charAt(i))){
                System.out.print(letters.charAt(i));
            }else{
                System.out.println();
            }
        }
    }
}
