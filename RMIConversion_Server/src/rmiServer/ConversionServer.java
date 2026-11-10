package rmiServer;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import rmiService.ConversionImpl;

public class ConversionServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            ConversionImpl service = new ConversionImpl();
            Naming.rebind("rmi://localhost:1099/ConversionService", service);
            System.out.println("Serveur de conversion pret...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
