package org.kartashov.part20_network.url_and_uri;

import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

public class NetworkAddresses {

    // https://www.baeldung.com/java-network-interfaces
    public static void main(String[] args) throws IOException {
//        InetAddress address = InetAddress.getByName("www.oreilly.com");
        InetAddress address = InetAddress.getByName("www.google.com");
        System.out.println("Host Address: " + address.getHostAddress());
        System.out.println("Host Address: " + address.isAnyLocalAddress());
        System.out.println("Host Address: " + address.isLinkLocalAddress());
        System.out.println("Host Address: " + address.isLoopbackAddress());
        System.out.println("Host Address: " + address.isMCGlobal());
        System.out.println("Host Address: " + address.isMCLinkLocal());
        System.out.println("Host Address: " + address.isMCNodeLocal());
        System.out.println("Host Address: " + address.isMCOrgLocal());
        System.out.println("Host Address: " + address.isMCSiteLocal());
        System.out.println("Host Address: " + address.isMulticastAddress());
        System.out.println("Host Address: " + address.isReachable(200)); // milliseconds
        System.out.println("Host Address: " + address.isSiteLocalAddress());

//        NetworkInterface nif = NetworkInterface.getByInetAddress(address);
        NetworkInterface nif = NetworkInterface.getByName("lo");
        System.out.println(nif.getHardwareAddress());
        System.out.println(nif.getMTU()); // Maxinum Transmission Unit - packet size
//        NetworkInterface nif = NetworkInterface.getByIndex(0);
        Enumeration<InetAddress> nifAddresses = nif.getInetAddresses();

        NetworkInterface nif2 = NetworkInterface.getByInetAddress(
                InetAddress.getLoopbackAddress());

        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();

        System.out.println("Stop");
    }
}
