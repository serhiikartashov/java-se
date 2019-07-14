package org.kartashov.part21_network.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClientRMI {
    private ClientRMI() {}
    public static void main(String[] args) {
        try {
//            System.setProperty("java.rmi.server.hostname","127.0.0.1");
            // Getting the registry
            Registry registry = LocateRegistry.getRegistry(1099); //getRegistry(null);

            // Looking up the registry for the remote object
            Hello stub = (Hello) registry.lookup("Hello");

            // Calling the remote method using the obtained object
            stub.printMsg();

            // System.out.println("Remote method invoked");
        } catch (Exception e) {
            System.err.println("ClientRMI exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
