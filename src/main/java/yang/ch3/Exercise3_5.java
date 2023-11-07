package yang.ch3;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exercise3_5 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        DataInputStream dis = null;
        int count=0;

        try {
            fis  = new FileInputStream("/Users/yang/NHN/NHN_TEAM_10_2/NHN_TEAM_10_2/src/main/java/yang/ch3/sale.dat");
            dis = new DataInputStream(fis);
            String data;
            while( (data=dis.readLine())!=null) {
                String[] data1 = data.split(":");
                try {
                    Double.parseDouble(data1[1]);
                }catch (NumberFormatException e){
                    count++;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("데이터가 제동되지 않은 도시의 수: "+count);
    }
}
