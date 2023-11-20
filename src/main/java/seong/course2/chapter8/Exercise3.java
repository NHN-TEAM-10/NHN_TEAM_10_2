package seong.course2.chapter8;

/**
 * 로마 숫자 -> 아라비아 숫자 아라비아 숫자 -> 로마숫자 1 ~ 3999만 가능
 */
public class Exercise3 {
    private int value;

    public int getInt() {
        return value;
    }

    public String getRoman(){
        return convertToRoman(this.value);
    }

    public Exercise3(int value) {
        if (value < 1 || value > 3999) {
            throw new NumberFormatException("1~3999 사이의 정수를 입력하세요");
        }
        this.value = value;
    }

    public Exercise3(String value) {
        if (value == null || value.isEmpty()) {
            throw new NumberFormatException("유효한 값을 입력하세요");
        }
        this.value = convertToInt(value);
    }

    private int romanToInt(char c) {
        switch (c) {
            case 'M':
                return 1000;
            case 'D':
                return 500;
            case 'C':
                return 100;
            case 'L':
                return 50;
            case 'X':
                return 10;
            case 'V':
                return 5;
            case 'I':
                return 1;
            default:
                throw new IllegalArgumentException("Unexpected value: " + c);
        }
    }

    /**
     * invariant -> sum값은 i의 첫번째 요소의 합이다.
     *
     * @param value not null, not empty
     * @return roman -> int convert된 값, 1~3999 이외의 값은 NumberFormatException
     */
    private int convertToInt(String value) {
        if (value.isEmpty()) {
            throw new IllegalArgumentException("비어있는 값입니다.");
        }

        int index = 0;
        int sum = 0;

        //첫번째 글자 확인, 정수값으로 변한
        // 두번째 글자가 더 크면 뒷글자 - 앞글자.
        while (index < value.length()) {
            int num = romanToInt(value.charAt(index));
            index++;
            if (index + 1 < value.length()) {
                int nextNum = romanToInt(value.charAt(index));
                if (nextNum > num) {
                    sum += nextNum - num;
                    index++;
                    continue;
                }
            }
            sum += num;
        }
        return sum;
    }

    private final int[] intValue = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private final String[] romanValue = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    /**
     * invariant -> sum값은 i의 첫번째 요소에서 roman 숫자를 뺀값이다.
     *
     * @param value 1 ~ 3999외의 값은 NumberFormatException 값이다.
     * @return Roman 값.
     */
    private String convertToRoman(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("음수값을 입력하셨습니다");
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < intValue.length; i++) {
            while(value >= intValue[i]) {
                sb.append(romanValue[i]);
                value -= intValue[i];
            }
        }
        return sb.toString();
    }
}
