package org.kartashov.part21_network.delivery_schemas.multicast;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastReceiver {

    public static void main(String[] args) {
        try {
            InetAddress group = InetAddress.getByName("225.4.5.6");
            MulticastSocket multicastSocket = new MulticastSocket(3456);
            multicastSocket.joinGroup(group);

            byte[] buffer = new byte[100];

            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            multicastSocket.receive(packet);

            System.out.println(new String(buffer));

            multicastSocket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
