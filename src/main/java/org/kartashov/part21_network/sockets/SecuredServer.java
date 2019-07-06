package org.kartashov.part21_network.sockets;

import javax.net.ssl.SSLServerSocketFactory;
import java.io.IOException;
import java.net.ServerSocket;

public class SecuredServer {

    /*
    set the protocol version system property:
    "-Djdk.tls.server.protocols=TLSv1.2" or
    "-Djdk.tls.client.protocols=TLSv1.2"
    As long as one of the sides has TLSv1.3 off, it will negotiate in a protocol where DSA is supported
     */
    public static void main(String[] args) throws IOException {
        System.setProperty("javax.net.ssl.keyStore", "secure.sockets.store");
        System.setProperty("javax.net.ssl.keyStorePassword", "password");
        ServerSocket serverSocket = ((SSLServerSocketFactory) SSLServerSocketFactory.getDefault()).createServerSocket(4444);
        System.out.println("Server Up and ready for connections....");
        while (true) {
            new ServerThread(serverSocket.accept()).start();
        }
    }

}
