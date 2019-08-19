package org.kartashov.part20_network.sockets;

import javax.net.ssl.SSLSocketFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SecuredClient {

    /*
    set the protocol version system property:
    "-Djdk.tls.server.protocols=TLSv1.2" or
    "-Djdk.tls.client.protocols=TLSv1.2"
    As long as one of the sides has TLSv1.3 off, it will negotiate in a protocol where DSA is supported
    */
    public static void main(String[] args) throws IOException {
        System.setProperty("javax.net.ssl.trustStore", "secure.sockets.store");
        System.setProperty("javax.net.ssl.keyStorePassword", "password");
        Socket socket = ((SSLSocketFactory) SSLSocketFactory.getDefault()).createSocket("localhost", 4444);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("please enter a username: ");
        printWriter.println(bufferedReader1.readLine());
        String message = null;
        while (true) {
            System.out.println("please enter a message to send to server...");
            message = bufferedReader1.readLine();
            if (message.equals("quit")) {
                printWriter.println(message);
                socket.close();
                break;
            }
            printWriter.println(message);
            System.out.println("Message reply from server...");
            System.out.println(bufferedReader.readLine());
        }
    }
}
