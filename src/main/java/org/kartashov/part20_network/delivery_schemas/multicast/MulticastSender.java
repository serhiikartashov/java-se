package org.kartashov.part20_network.delivery_schemas.multicast;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastSender {

    public static void main(String[] args) {
        try {
            InetAddress group = InetAddress.getByName("225.4.5.6");
            MulticastSocket multicastSocket = new MulticastSocket();

            String msg = "Hello. How are you?";

            DatagramPacket packet = new DatagramPacket(msg.getBytes(), msg.length(), group, 3456);
            multicastSocket.send(packet);

            multicastSocket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
