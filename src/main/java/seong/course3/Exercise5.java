package seong.course3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exercise5 {
    public static void main(String[] args) throws IOException {
        File file = new File("sales.dat");
        BufferedReader br = new BufferedReader(new FileReader(file));

        double result = 0;
        String line;
        while((line = br.readLine()) != null){
            int index = 0;
            while (index < line.length()) {
                if (line.charAt(index) != ':') {
                       index++;
                }else{
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
            }

        }
        System.out.println(result);



    }
}
