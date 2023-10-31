package seong.course2.chapter2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exercise7 {
    public static void main(String[] args) throws IOException {
        int exam1, exam2, exam3;

        File file = new File("testdata.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        exam1 = Integer.parseInt(br.readLine());
        exam2 = Integer.parseInt(br.readLine());
        exam3 = Integer.parseInt(br.readLine());
        double average = (exam1 + exam2+ exam3)/3;
        System.out.println("시험 결과는 "+ average);
    }


}
