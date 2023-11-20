package seong.course3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exercise5 {
    public static void main(String[] args) throws IOException {
        File file = new File(
                "/Users/gimseonghyeon/Desktop/maven-test/NHN_TEAM_10_2/src/main/java/seong/course3/sales.dat");
        BufferedReader br = new BufferedReader(new FileReader(file));

        double result = 0;
        String line;
        int notProvidedCount = 0;
        while ((line = br.readLine()) != null) {
            int index = 0;
            while (index < line.length()) {
                if (line.charAt(index) != ':') {
                    index++;
                } else {
                    break;
                }
            }
            index++;
            line = line.substring(index);
            double value;
            try {
                value = Double.parseDouble(line);
                result += value;
            } catch (NumberFormatException e) {
                notProvidedCount++;
            }

        }
        System.out.println("매출 총합 : " + result);
        System.out.println("제공되지 않은 도시 개수 : " + notProvidedCount);


    }
}
