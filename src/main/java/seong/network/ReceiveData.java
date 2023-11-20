package seong.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ReceiveData extends Thread{
    private String host;
    private int port;


    public ReceiveData(String host, int port) {
        this.host = host;
        this.port = port;
    }

    @Override
    public void run() {
        try (Socket socket = new Socket(host, port)) {
            System.out.println("서버로부터 도착한 값입니다.");
            BufferedReader socketIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter terminalOut = new BufferedWriter(new OutputStreamWriter(System.out));

            String line;
            while(true) {
                line = socketIn.readLine();
                if (line.equals("exit")) {
                    return;
                }
                terminalOut.write(line + "\n");
                terminalOut.flush();
            }
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
