package seong.network;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Quiz03 {
    /**
     * socket의 정보, remote socket의 정보를 출력하는 메서드
     *
     * @param host host의 이름
     * @param port 1~ 10000사이의 정수값 이외는 @Throws IllegalArgumentException
     */
    public static void getSocketInformation(String host, int port) {
        if (port < 1) {
            throw new IllegalArgumentException();
        }
        if (port > 10000) {
            throw new IllegalArgumentException();
        }

        try (Socket socket = new Socket(host, port)) {

            System.out.println("Local address1 : " + socket.getLocalAddress());
            System.out.println("Local port1 : " + socket.getLocalPort());
            System.out.println("Remote address : " + socket.getRemoteSocketAddress());
            System.out.println("Remote port : " + socket.getPort());
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void getSocketInformation() {
        getSocketInformation("localhost", 1234);
    }

    public static void getSocketInformation(String host) {
        getSocketInformation(host, 1234);
    }

    public static void main(String[] args) {
        // 커맨드 라인으로 host, port 불러옴
        // socket으로 연결한 후 , local, remote address, port 불러오기
        String host;
        int port;

        if (args.length == 0) {
            getSocketInformation();
        }

        if (args.length == 1) {
            host = args[0];
            getSocketInformation(host);
        }

        if (args.length == 2) {
            host = args[0];
            port = Integer.parseInt(args[1]);
            getSocketInformation(host, port);
        }

    }
}
