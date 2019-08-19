package org.kartashov.part20_network.jndi.rmi.gui;

import java.rmi.Remote;
import java.rmi.RemoteException;

// Creating Remote interface for our application
public interface Hello extends Remote {
    void animation() throws RemoteException;
}
