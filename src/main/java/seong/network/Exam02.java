package seong.network;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Exam02 {

    /**
     * Client socket을 server에 연결하여 data를 보낸다.
     * port는 1~ 10000사이의 값이다.
     */
    public static void transferData(String host, int port){
        if (port < 1) {
            throw new IllegalArgumentException();
        }
        if (port > 10000) {
            throw new IllegalArgumentException();
        }
        try (Socket socket = new Socket(host, port)) {
            OutputStream os =  socket.getOutputStream();
            String line = "hello, World!";
            os.write(line.getBytes());
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        String host = "localhost";
        int port = 8080;
        transferData(host,port);
    }
}
