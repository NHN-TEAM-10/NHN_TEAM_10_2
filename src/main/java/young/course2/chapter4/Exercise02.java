package young.course2.chapter4;
/*
The hexadecimal digits are the ordinary, base-10 digits '0' through '9' plus the letters 'A' through 'F'.
In the hexadecimal system, these digits represent the values 0 through 15, respectively.
Write a function named hexValue that uses a switch statement to find the hexadecimal value of a given character.
The character is a parameter to the function, and its hexadecimal value is the return value of the function.
You should count lower case letters 'a' through 'f' as having the same value as the corresponding upper case letters.
If the parameter is not one of the legal hexadecimal digits, return -1 as the value of the function.

A hexadecimal integer is a sequence of hexadecimal digits, such as 34A7, ff8, 174204, or FADE.
If str is a string containing a hexadecimal integer, then the corresponding base-10 integer can be computed as follows:

value = 0;
for ( i = 0; i < str.length();  i++ )
   value = value*16 + hexValue( str.charAt(i) );
Of course, this is not valid if str contains any characters that are not hexadecimal digits. Write a program that reads a string from the user. If all the characters in the string are hexadecimal digits, print out the corresponding base-10 value. If not, print out an error message.
 */

public class Exercise02 {
    public static int hexValue(char c) {
        int hexVal = -1;

        switch (c) {
            case '1':
                hexVal = 1;
                break;
            case '2':
                hexVal = 2;
                break;
            case '3':
                hexVal = 3;
                break;
            case '4':
                hexVal = 4;
                break;
            case '5':
                hexVal = 5;
                break;
            case '6':
                hexVal = 6;
                break;
            case '7':
                hexVal = 7;
                break;
            case '8':
                hexVal = 8;
                break;
            case '9':
                hexVal = 9;
                break;
            case 'a':
                hexVal = 10;
                break;
            case 'b':
                hexVal = 11;
                break;
            case 'c':
                hexVal = 12;
                break;
            case 'd':
                hexVal = 13;
                break;
            case 'e':
                hexVal = 14;
                break;
            case 'f':
                hexVal = 15;
                break;
        }

        if (hexVal == -1) {
            throw new IllegalArgumentException("잘못된 값이 입력되었습니다.");
        } else {
            return hexVal;
        }
    }

    public static void main(String[] args) {
        int value = 0;
        String str = "a5";

        for (int i = 0; i < str.length(); i++)
            value = value * 16 + hexValue(str.charAt(i));

        System.out.println(value);
    }
}
