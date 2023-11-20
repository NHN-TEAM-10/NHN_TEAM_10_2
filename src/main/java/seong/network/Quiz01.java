package seong.network;

import java.io.IOException;
import java.net.Socket;

public class Quiz01 {

    /**
     * start ~ end까지 열려있는 port를 찾는다.
     * class invariant : i의 첫번째 요소에 해당하는 port에 접근.
     * @param start 0이상의 정수값
     * @param end 10000이하의 정수 값. 이 범위를 벗어나면 @Throws IllegalArgumentException.
     * 열려있는 포트번호를 출력한다.
     */
    public static void printOpenPort(int start, int end) {
        if (start < 1) {
            throw new IllegalArgumentException();
        }
        if (end > 10000) {
            throw new IllegalArgumentException();
        }

        String host = "localhost";
        int port;
        for (int i = start; i <= end; i++) {
            port = i;
            try {
                Socket socket = new Socket(host, port);
                System.out.println("Port " + port + " 열려 있습니다.");
            } catch (IOException e) {
                continue;
            }
        }
    }

    public static void printOpenPort(){
        printOpenPort(1,10000);
    }
    public static void main(String[] args) {
        printOpenPort();
        printOpenPort(8000, 8090);
    }
}
