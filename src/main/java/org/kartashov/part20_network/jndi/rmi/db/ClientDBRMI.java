package org.kartashov.part20_network.jndi.rmi.db;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;

public class ClientDBRMI {
    private ClientDBRMI(){}
    public static void main(String[] args)throws Exception {
        try {
            // Getting the registry
            Registry registry = LocateRegistry.getRegistry(null);

            // Looking up the registry for the remote object
            Hello stub = (Hello) registry.lookup("Hello");

            // Calling the remote method using the obtained object
            List<Student> list = (List)stub.getStudents();
            for (Student s:list) {

                // System.out.println("bc "+s.getBranch());
                System.out.println("ID: " + s.getId());
                System.out.println("name: " + s.getName());
                System.out.println("branch: " + s.getBranch());
                System.out.println("percent: " + s.getPercent());
                System.out.println("email: " + s.getEmail());
            }
            // System.out.println(list);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
