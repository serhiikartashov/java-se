package org.kartashov.part21_network.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ServerRMI extends ImplExample {
    public ServerRMI() {}
    public static void main(String args[]) {
        try {

//            System.setProperty("java.rmi.server.hostname","127.0.0.1");
            // Instantiating the implementation class
            ImplExample obj = new ImplExample();

            // Exporting the object of implementation class
            // (here we are exporting the remote object to the stub)
            Hello stub = (Hello) UnicastRemoteObject.exportObject(obj, 0);

            // Binding the remote object (stub) in the registry
//            Registry registry = LocateRegistry.getRegistry();
            Registry registry = LocateRegistry.createRegistry(1099);

            registry.bind("Hello", stub);
            System.err.println("ServerRMI ready");
        } catch (Exception e) {
            System.err.println("ServerRMI exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
