package seong.network;

import java.io.IOException;
import java.net.Socket;

public class Exam01 {
    public static void main(String[] args) {
        String hostIp = "localhost";
        int port = 12345;
        try {
            Socket socket = new Socket(hostIp, port);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
