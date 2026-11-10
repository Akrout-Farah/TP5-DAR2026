package rmiServer;

import java.rmi.registry.LocateRegistry;

import javax.naming.Context;
import javax.naming.InitialContext;

import rmiService.BanqueImpl;

public class BanqueServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            Context ctx = new InitialContext();
            ctx.rebind("BanqueService", new BanqueImpl());
            System.out.println("Serveur Banque (JNDI) pret...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
