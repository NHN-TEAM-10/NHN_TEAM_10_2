package seong.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Thread를 사용한 비동기. Receive class에 Thread를 사용하여 수신을 비동기로 처리한다.
 */
public class Quiz07 {
    /**
     * BufferedReader를 이용하여 특정 소켓이 서버에서 받은값을 출력하는 쓰레드.
     *
     */
    static class Receiver extends Thread{
        private BufferedReader input;

        @Override
        public void run() {
            try (BufferedWriter terminalOut = new BufferedWriter(new OutputStreamWriter(System.out))) {

                while(!Thread.currentThread().isInterrupted()){

                    String line = input.readLine();
                    System.out.println("서버로 부터 도착한 값입니다.");
                    terminalOut.write(line + "\n");
                    terminalOut.flush();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public Receiver(BufferedReader input) {
            this.input = input;
        }


    }

    /**
     * server와 연결한뒤 문자열 값을 전송한다. port번호는 1 ~ 10000 사이값.
     *
     * @param args
     */
    public static void main(String[] args) {

        String host = "localhost";
        int port = 8080;

        if (port < 1 || port > 10000) {
            throw new IllegalArgumentException();
        }
        // 서버로 data 보내기
        // 소켓으로 서버와 연결
        // 문자열을 입력받아서
        // 값을 서버에 전송한다.
        try (Socket socket = new Socket(host, port); BufferedWriter socketOut = new BufferedWriter(
                new OutputStreamWriter(socket.getOutputStream())); BufferedReader terminalIn = new BufferedReader(
                new InputStreamReader(System.in)); BufferedReader socketIn = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            Receiver receiver = new Receiver(socketIn);

            receiver.start();
            String line;
            while((line = terminalIn.readLine()) != null){
                if (line.isEmpty()) {
                    break;
                }
                socketOut.write(line + "\n");
                socketOut.flush();
            }


        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
