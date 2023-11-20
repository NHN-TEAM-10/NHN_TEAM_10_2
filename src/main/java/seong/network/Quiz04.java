package seong.network;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * client socket에서 server에 연결하여, data를 전송, exit 입력시 프로그램 종료
 */
public class Quiz04 {

    /**
     * Client socket을 server에 연결하여 data를 보낸다.
     * exit를 입력받으면 종료.
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
            Scanner sc = new Scanner(System.in);
            OutputStream os =  socket.getOutputStream();
            String line;
            while(true) {
                line = sc.next();
                if (line.equals("exit")) {
                    return;
                }
                os.write(line.getBytes());
            }
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        String host;
        int port;

        if (args.length == 0) {
            transferData();
        }

        if (args.length == 1) {
            host = args[0];
            transferData(host);
        }

        if (args.length == 2) {
            host = args[0];
            port = Integer.parseInt(args[1]);
            transferData(host, port);
        }
    }

    private static void transferData(String host) {
        transferData(host, 1234);
    }

    private static void transferData() {
        transferData("localhost", 1234);
    }
}

