package seong.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TransferData extends Thread {
    private String host;
    private int port;

    public TransferData(String host, int port) {
        this.host = host;
        this.port = port;
    }

    @Override
    public void run() {

    }
}
