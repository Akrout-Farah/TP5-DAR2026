package rmiClient;

import java.rmi.Naming;

import rmiService.IConversion;

public class ConversionClient {
    public static void main(String[] args) {
        try {
            IConversion stub = (IConversion) Naming.lookup(
                    "rmi://localhost:1099/ConversionService");
            System.out.println("500 EUR = " + stub.convertirMontant(500) + " TND");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
