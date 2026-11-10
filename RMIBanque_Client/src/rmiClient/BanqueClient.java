package rmiClient;

import java.util.Date;

import javax.naming.Context;
import javax.naming.InitialContext;

import metier.Compte;
import rmiService.IBanque;

public class BanqueClient {
    public static void main(String[] args) {
        try {
            Context ctx = new InitialContext();
            IBanque banque = (IBanque) ctx.lookup("BanqueService");

            System.out.println(banque.creerCompte(new Compte(1, 1500.0, new Date())));
            System.out.println(banque.creerCompte(new Compte(1, 200.0, new Date())));
            System.out.println(banque.getInfoCompte(1));
            System.out.println(banque.getInfoCompte(99));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
