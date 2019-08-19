package org.kartashov.part20_network.jndi.rmi.db;

import java.rmi.Remote;
import java.util.List;

public interface Hello extends Remote {
    public List<Student> getStudents() throws Exception;
}
